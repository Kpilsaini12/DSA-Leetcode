class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=nums.length;
        for(int i=0;i<l;i++){
           if(nums[i]==target){
            return i;
           }
        }
        int i;
        for(i=0;i<l;i++){
            if(target<nums[0]){
                return 0;
            }
            else if(target<nums[i]){
                return i;
            }
        }

        return i;
    }
}