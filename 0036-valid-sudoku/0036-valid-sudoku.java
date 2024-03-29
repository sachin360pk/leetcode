class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen=new HashSet();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num=board[i][j];
              if(num!='.'){
                    if(seen.contains(num+"_R_"+i) || 
                       seen.contains(num+"_C_"+j) ||
                       seen.contains(num+"_B_"+i/3+"_"+j/3)){
                        return false;
                    }else{
                        seen.add(num+"_R_"+i);
                        seen.add(num+"_C_"+j);
                        seen.add(num+"_B_"+i/3+"_"+j/3);
                    }
                }
            }
        }
        return true;
    }
}