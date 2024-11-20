class Solution {
    public List<Integer> majorityElement(int[] nums) {
         int n=nums.length;
        List<Integer> result=new ArrayList<>();
        
        int cand1=0,cand2=0;
        int cnt1=0,cnt2=0;
        for(int num:nums){
            if(num==cand1){
                cnt1++;
            }
            else if(num==cand2){
                cnt2++;
            }
            else if(cnt1==0){
                cand1=num;
                cnt1=1;
            }
            else if(cnt2==0){
                cand2=num;
                cnt2=1;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        
        cnt1=0;
        cnt2=0;
        for(int num: nums){
            if(num==cand1){
                cnt1++;
            }
            else if(num==cand2){
                cnt2++;
            }
        }
        Set<Integer> uniqueCandidates = new HashSet<>();
        if(cnt1 >n/3){
            result.add(cand1);
        }
        if(cnt2 >n/3){
            result.add(cand2);
        }
        result.addAll(uniqueCandidates);
        result.sort(Integer :: compareTo);
        return result;
        
    }
}