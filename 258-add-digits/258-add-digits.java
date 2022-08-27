class Solution {
    public static int addNum(int t){
        int sum=0;
        while(t>0){
            int temp = t%10;
            sum+=temp;
            t/=10;
        }
        return sum;
    }
    public int addDigits(int num) {
        int n=num;
        while((n/10)>0){
            int temp=addNum(n);
            n=temp;
        }
        return n;
    }
}