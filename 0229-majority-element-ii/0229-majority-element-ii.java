public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0;
        int cnt2=0;
        Integer maj1=null;
        Integer maj2=null;
        int n=nums.length;
        for(int num:nums){
            if(maj1!=null && maj1==num){
                cnt1++;
            }
            else if(maj2!=null && maj2==num){
                cnt2++;
            }
            else if(cnt1==0){
                maj1=num;
                cnt1=1;
            }
            else if(cnt2==0){
                maj2=num;
                cnt2=1;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int num:nums){
            if(num==maj1)
                cnt1++;
            else if(maj2==num)
                cnt2++;
        }
        List<Integer>ans=new ArrayList<>();
        if(cnt1>Math.floor(n/3)){
            ans.add(maj1);
        }
        if(cnt2>Math.floor(n/3)){
            ans.add(maj2);
        }
        return ans;

    }
}