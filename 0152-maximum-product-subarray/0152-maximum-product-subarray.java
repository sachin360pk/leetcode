// first method

// class Solution {
//     public int maxProduct(int[] nums) {
//         if(nums.length==1){
//             return nums[0];
//         }
//         int ans=Integer.MIN_VALUE;
//         for(int i=0;i<nums.length-1;i++){
//             int pro=nums[i];
//             ans=Math.max(pro,ans);
//             for(int j=i+1;j<nums.length;j++){
//                 pro=pro*nums[j];
//                 ans=Math.max(pro,ans);
//             }
//         }
//         ans=Math.max(nums[nums.length-1],ans);
//         return ans;
//     }
// }


// second method

class Solution {
    public int maxProduct(int[] nums) {
        int res=Integer.MIN_VALUE;
        int t1=1;
        int t2=1;
        for(int i=0;i<nums.length;i++){
            t1 = t1*nums[i];
            res = Math.max(res,t1);
            if(t1==0){
                t1 = 1;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            t2 = t2*nums[i];
            res = Math.max(res,t2);
            if(t2==0){
                t2=1;
            }
        }
        return res;
    }
}