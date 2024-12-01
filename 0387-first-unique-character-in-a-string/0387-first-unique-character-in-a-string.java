class Solution {
    public int firstUniqChar(String s) {
        int l=s.length();
        char chr='\0';
        int[] count=new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        
        for(int i=0;i<l;i++){
            char c = s.charAt(i);
            if (count[c- 'a'] == 1) {
                return i;
            }
        }
        
        
        return -1;
    }
}