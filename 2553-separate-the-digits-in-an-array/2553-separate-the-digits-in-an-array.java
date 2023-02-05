class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            int t = nums[i];
            List<Integer> ls = new ArrayList<>();
            while(t > 9){
                int y = t%10;
                ls.add(y);
                t = t/10;
            }
            list.add(t);
            for(int j=ls.size()-1;j>=0;j--){
                list.add(ls.get(j));
                // ls.remove(i);
            }
            // list.add(t);
        }
        int[] arr2 = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr2[i] = list.get(i); 
        }
        return arr2;
    }
}