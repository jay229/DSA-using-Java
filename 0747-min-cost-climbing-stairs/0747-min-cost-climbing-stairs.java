class Solution {
    int dp[];
    public int solve(int cost[],int i){
        if(i>=cost.length)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        int a=cost[i]+solve(cost,i+1);
        int b=cost[i]+solve(cost,i+2);
        return dp[i]= Math.min(a,b);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        dp=new int[1001];
        Arrays.fill(dp,-1);
        return Math.min(solve(cost,0),solve(cost,1));
    }
}