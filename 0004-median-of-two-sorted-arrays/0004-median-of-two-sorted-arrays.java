 class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int maxLen=m+n;
        int[] newArr=new int[maxLen];
        for(int i=0;i<m;i++){
            newArr[i]=nums1[i];
        }

        int j=m;
        for(int i=0;i<n;i++){
            newArr[j]=nums2[i];
            j++;
        }
        int z=1;
        while(z<=maxLen){
        for(int i=0;i<maxLen-1;i++){
            if(newArr[i]>newArr[i+1]){
                int temp=newArr[i];
                newArr[i]=newArr[i+1];
                newArr[i+1]=temp;
            }
        }
            z++;
        }
        
        double median;
        double num=0;
        if(maxLen%2!=0){
             median=newArr[maxLen/2];
        }
        else{
             num=newArr[maxLen/2]+newArr[(maxLen/2)-1];
             median=(num/2);
        }
        return median;

    }
}