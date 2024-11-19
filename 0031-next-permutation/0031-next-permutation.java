class Solution {
    public void nextPermutation(int[] nums) {
        int l=nums.length;
        int m = 0;
        int temp;
        int j=0;
        for(int i=0;i<l-1;i++){
            if(nums[i]<nums[i+1]){
                j=1;
                break;
            }
        }
        if(j==0){
            for(int i=0;i<l-1;i++){
                if(nums[i]<nums[i+1]){
                    break;
                }
                java.util.Arrays.sort(nums);
            }
        }

        if(j==1){
            for(int i=l-1;i>0;i--){
                if(nums[i-1]<nums[i]){
                    m=i-1;
                    break;
                }
            }
            for(int i=l-1;i>=0;i--){
                if(nums[i]>nums[m]){
                    temp=nums[i];
                    nums[i]=nums[m];
                    nums[m]=temp;
                    break;
                }
            }
        }
        Arrays.sort(nums,m+1,l);
        
    }
}