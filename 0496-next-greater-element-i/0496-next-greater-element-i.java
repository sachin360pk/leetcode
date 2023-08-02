class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        int ans1[]=new int[nums2.length];
        Stack<Integer> s=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!s.isEmpty() && nums2[s.peek()]<=nums2[i])
                s.pop();
            if(s.isEmpty())  ans1[i]=-1;
            else  ans1[i]=nums2[s.peek()];
            s.push(i);
        }
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j])  ans[i]=ans1[j];
            }
        }
        return ans;
    }
}