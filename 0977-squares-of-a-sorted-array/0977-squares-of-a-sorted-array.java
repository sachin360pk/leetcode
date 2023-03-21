class Solution {
    public int[] sortedSquares(int[] nums) {
        int size=nums.length;                               
        int [] result=new int[size];
        int curr=size-1;
        int left=0;
        int right=size-1;
        while(left<=right){
            int leftValue=nums[left]*nums[left];
            int rightValue=nums[right]*nums[right];
            if(leftValue>rightValue){
                result[curr]=leftValue;
                left++;
                curr--;
            }else{
                result[curr]=rightValue;
                right--;
                curr--;
            }
        }
        return result;
    }
}