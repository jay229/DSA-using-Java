class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        TreeSet<Integer>set=new TreeSet<>();
        for(int num:nums){
            set.add(num);
        }
        int cnt=1;
        int max=1;
        int ans[]=new int[set.size()];
        int i=0;
        for(int num:set){
            ans[i++]=num;
        }
        if(ans.length==1)
            return 1;
        int last=ans[0];
        for(i=1;i<ans.length;i++){
            if(ans[i]==last+1){
                cnt++;
                last=ans[i];
                max=Math.max(max,cnt);
            }
            else{
                cnt=1;
                last=ans[i];
            }
            
           
        }
        return max;

    }
    // -6,-1,-1,9,-8,-6,-6,4,4,-3,-8,-1
    // -8 -6 -3 -1 
}