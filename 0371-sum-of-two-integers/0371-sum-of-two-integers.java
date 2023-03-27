class Solution {
    public int getSum(int a, int b) {
        
        // use only for positive numbers
        // for (int i = 1; i <= b; i++)
        //     a++;
        // return a;
        
        // bit bise manipulation
        // a=2=00000010
        // b=3=00000011
        // sum=00000101
        // we have both positive numbers and both negetive numbers and one positive one negetive
         // to check kis positition pr value alag alag hn then ans is 0 otherwise one
        // kaha pr dono digit ek hee h
        // find xor and carry and left shift carry
        // again take xor with xor and carry lift shift
        
        int xor=a^b;
        int carry=a&b;
        if(carry==0)
            return xor;
        else 
            return getSum(xor,carry<<1);        
    }
}