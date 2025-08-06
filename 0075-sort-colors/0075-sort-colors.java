class Solution {
    public void sortColors(int[] nums) {
        int len=nums.length;
        int count1=0;
        int count2=0;
        for(int i=0;i<len;i++){
            if(nums[i]==1 || nums[i]==2){
                if(nums[i]==1){
                    count1++;
                }
                else{
                    count2++;
                }
            }
        }

        int count0=len-(count1+count2);
        for(int i=0;i<len;i++){
            if(i<count0){
                nums[i]=0;
            }
            else if(i>=count0 && (i<count0+count1)){
                nums[i]=1;
            }
            else if(i>=count0+count1){
                nums[i]=2;
            }
        }
    }
}