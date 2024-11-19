class Solution {
    void moveZeroes(int[] arr) {
      int l=arr.length;
        int count=0;
        int index;
        for(int i=0;i<l;i++){
            if(arr[i]==0){
                count++;
            }
        }
        if(count>0) {
            index=0;
            for(int i=0;i<l;i++){
                if(arr[i]!=0){
                    arr[index]=arr[i];
                    index++;
                }
            }
            for(int i=index;i<l;i++){
                arr[i]=0;
            }
            
        }
        
    }
    
}