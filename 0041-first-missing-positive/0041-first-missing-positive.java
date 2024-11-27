class Solution {
    public int firstMissingPositive(int[] nums) {
         int l=nums.length;
        int small=1;
        Arrays.sort(nums);
        int max=nums[l-1];
        for(int i=0;i<l;i++){
            if(nums[i]<0 || nums[i]==0){
                continue;
            }
            if(nums[i]==small){
                small++;
            }
            else if (nums[i]>small){
                return small;
            }
        }
        for(int i=0;i<l;i++){
            if(nums[i]>0){
                break;
            }
            else{
                return small;
            }
        }
        return max+1;
        
    }
}