class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> lst=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            int curr=Math.abs(nums[i]);
            nums[curr-1]=-(Math.abs(nums[curr-1]));
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                lst.add(i+1);
            }
        }
        return lst;
    }
}