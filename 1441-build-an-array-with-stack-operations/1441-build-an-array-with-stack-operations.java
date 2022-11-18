class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<Integer> s=new Stack<Integer>();
       List<String> lst=new ArrayList<String>();  
        // Arrays.sort(target);
        int size=target.length;
        int num=1;
        int i=0;
        while(i<size){
            int t=target[i];
            if(t==num){
                lst.add("Push");
                i++;
            }
            else{
                lst.add("Push");
                lst.add("Pop");
            }
            num++;
        }
        return lst;
    }
    
}