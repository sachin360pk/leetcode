class Solution {
    public int climbStairs(int n) {
        //use fibonacchi series
        int [] dp=new int[n+1];   //dp=dynamic programming
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}