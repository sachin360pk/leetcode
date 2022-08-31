class Solution {
    public int rob(int[] nums) {
        int n=nums.length;//find number of home
        if(nums==null || n==0)
            return 0;
        if(n==1) 
            return nums[0];
        if(n==2)
            return Math.max(nums[0],nums[1]);
        
        int dp[]=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Integer.max(nums[1],nums[0]);
        
        for(int i=2;i<nums.length;i++){
            dp[i]=Integer.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
}
//single pass TC=O(n);
//dp array SC=O(n)