class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int n1=n/2;
        String a=s.substring(0,n1);
        String b=s.substring(n1,n);
        int c1=0;
        int c2=0;
        for(int i=0;i<n1;i++){
            if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' ||                               a.charAt(i)=='u' || a.charAt(i)=='A' || a.charAt(i)=='E' || a.charAt(i)=='I'
              || a.charAt(i)=='O' || a.charAt(i)=='U')
                c1++;
        }
       for(int i=0;i<n1;i++){
            if(b.charAt(i)=='a' || b.charAt(i)=='e' || b.charAt(i)=='i' || b.charAt(i)=='o' ||                               b.charAt(i)=='u' || b.charAt(i)=='A' || b.charAt(i)=='E' || b.charAt(i)=='I'
              || b.charAt(i)=='O' || b.charAt(i)=='U')
                c2++;
        }
        if(c1==c2)
            return true;
        return false;
    }
}