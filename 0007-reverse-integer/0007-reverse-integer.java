class Solution {
    public int reverse(int x) {
        int orgNum=x;
        int rvrsNum=0;
        int rem=0;
        if(x<0){
            x=-x;
        }
        while(x>0){
            rem=x%10;
            if (rvrsNum > Integer.MAX_VALUE / 10 ) {
                return 0; // overflow for positive case
            }
            rvrsNum=rvrsNum*10 +rem;
            x=x/10;
        }
        if(orgNum<0){
            rvrsNum=-rvrsNum;
        }
       
        return rvrsNum;
    }
}