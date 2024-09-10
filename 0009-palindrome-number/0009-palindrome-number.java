class Solution {
    public boolean isPalindrome(int x) {
        int orgNum=x;
        int rvrsNum=0;
        int rem=0;
        while(x>0){
            rem=x%10;
            rvrsNum=rvrsNum*10 +rem;
            x=x/10;
        }
        if(orgNum==rvrsNum){
            return true;
        }
        else{
            return false;
        }
    }
}