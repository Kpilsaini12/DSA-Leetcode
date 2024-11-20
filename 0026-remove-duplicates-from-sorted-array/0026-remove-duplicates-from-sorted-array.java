class Solution {
    public int removeDuplicates(int[] nums) {
        int l=nums.length;
        int var=0;
        int[] redun=nums.clone();
        int j=1;
        for(int i=1;i<l;i++){
            if(redun[i]!=redun[i-1]){
                nums[j]=redun[i];
                j++;
            }
        }
        return j;
    }
}