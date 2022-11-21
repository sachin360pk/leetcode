class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> lst=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){//4,3,2,7,8,2,3,1
            int n=Math.abs(nums[i]);//return +tive value always
            if(nums[n-1]<0)
                lst.add(n);
            else{
                nums[n-1]=-1*nums[n-1];
            }
        }
        return lst;
    }
}