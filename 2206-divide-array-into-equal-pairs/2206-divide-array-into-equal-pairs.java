class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> lst = new ArrayList<>();
        for(Map.Entry<Integer,Integer> i : map.entrySet()){
            lst.add(i.getValue());
        }
        for(int i =0;i<map.size();i++){
            if(lst.get(i)%2!=0)
                return false;
        }
        return true;
    }
}