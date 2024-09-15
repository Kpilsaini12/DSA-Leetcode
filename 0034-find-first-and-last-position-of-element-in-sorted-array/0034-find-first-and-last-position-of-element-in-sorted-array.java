class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=nums.length;
        int r=0;
        int[] Arr=new int[2];
        

        for(int i=0;i<l;i++){
            if(nums[i]==target){
              r++;
            }
        }
        int j=0;
        if(r!=0){
            for(int i=0;i<l;i++){
            if(nums[i]==target){
                j=i;
            }
          }
        }
       
       if(r==0){
        Arr[0]=-1;
        Arr[1]=-1;
       }
       else{
        Arr[0]=j-r+1;
        Arr[1]=j;
       }

        return Arr;
        
    }
}