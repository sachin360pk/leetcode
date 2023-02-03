class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int pro=nums[i];
            ans=Math.max(pro,ans);
            for(int j=i+1;j<nums.length;j++){
                pro=pro*nums[j];
                ans=Math.max(pro,ans);
            }
        }
        ans=Math.max(nums[nums.length-1],ans);
        return ans;
    }
}