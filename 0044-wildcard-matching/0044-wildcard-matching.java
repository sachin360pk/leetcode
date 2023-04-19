class Solution {
    public boolean isMatch(String s, String p) {
        //using 2D matrix
        int m=s.length();
        int n=p.length();
        char[] str=s.toCharArray();
        char[] pattern=p.toCharArray();
        //if in pattern more than one star is occure then treated all star as one
        int writeIndex=0;
        boolean isFirst=true;
        for(int i=0;i<n;i++){
            if(pattern[i]=='*'){
                if(isFirst){
                    pattern[writeIndex++]=pattern[i];
                    isFirst=false;
                }
            }
            else{
                pattern[writeIndex++]=pattern[i];
                isFirst=true;
            }
        }
        //main logic
        boolean[][] T=new boolean[m+1][n+1];
        if(writeIndex>0 && pattern[0]=='*'){
            T[0][1]=true;
        }
        T[0][0]=true;
        for(int i=1;i<T.length;i++){
            for(int j=1;j<T[0].length;j++){
                if(pattern[j-1]=='?' || str[i-1]==pattern[j-1]){
                    T[i][j]=T[i-1][j-1];
                }
                else if(pattern[j-1]=='*'){
                    T[i][j]=T[i-1][j] || T[i][j-1];
                }
            }
        }
        return T[str.length][writeIndex];
    }
}