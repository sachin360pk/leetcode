class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int len=nums.length;
        int count=0;
        for(int i=0;i<len;i++){
            int prod=nums[i];
            if(prod<k)
                count++;
            for(int j=i+1;j<len && prod<k;j++){
                prod*=nums[j];
                if(prod<k)
                    count++;
            }
        }
        return count;
    }
}