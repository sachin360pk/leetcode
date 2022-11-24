class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int ans[]=new int[2];
        if(nums.length==0){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        
        int pos=bSearch(nums,left,right,target);
        int end=-1;
        int start=-1;
        for(int i=0;i<=pos;i++){
            if(nums[i]==target){
                start=i;
                break;
            }
        }
         for(int i=nums.length-1;i>=pos;i--){
            if(nums[i]==target){
                end=i;
                break;
            }
        }
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    private int bSearch(int[] nums,int left,int right,int target){
        int pos=0;
        if(right>=left){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
               return mid;
            }
            if(nums[mid]>target){
                return bSearch(nums,left,mid-1,target);
            }
            return bSearch(nums,mid+1,right,target);
        }
        return pos;
    }
}