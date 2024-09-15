class Solution {
    public int strStr(String haystack, String needle) {
        int size=needle.length();
        int size1=haystack.length();
        if(size1<size){
            return -1;
        }
        for(int i=0;i<size1-size+1;i++){
            if((haystack.charAt(i)==needle.charAt(0))){
                if(haystack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}