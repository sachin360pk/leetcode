class Solution {
    public boolean isPowerOfTwo(int n) {
        //if a number is power of two it reduce to one if we 
        //recursively divide it by two while the remainder is zero
        //check if number is one
        if(n==0)
            return false;
        while(n%2==0){
             n/=2;
        }
        return n==1;
    }
}