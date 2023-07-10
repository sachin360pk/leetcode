class Solution {
    public int findComplement(int num) {
        //jb hm kisi number pr binary operation apply karte hn to nuner ko binary m badalne kee koi aavashyakta nahi h
        //koi bhee number me kithne bit x hm then n=2 kee power x
        //step1 compute the bit length
        if(num==0) return 1;
        double nr=Math.log(num);
        double dr=Math.log(2);
        int bitlen=(int)(nr/dr)+1;  //(int)Math.log(num)/(int)Math.log(2)+1
        int bitmask=(1<<(bitlen))-1;
        return (bitmask^num);
    }
}