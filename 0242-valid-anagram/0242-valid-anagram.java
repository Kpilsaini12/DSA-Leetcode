class Solution {
    public boolean isAnagram(String s, String t) {
          if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Create a frequency array for 26 lowercase letters
        int[] count = new int[26];

        
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--; 
        }

        // Step 4: Check if all counts are zero
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true; 
    }
}