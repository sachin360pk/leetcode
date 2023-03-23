class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>lst=new ArrayList<>();
        if(matrix.length==0) return lst;
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0,j=0,k;
         while (i < m && j < n) {
            for (k = j; k < n; k++) { //go left to right
                lst.add(matrix[i][k]);
            }
            i++;
         
            for (k = i; k < m; k++) { //up to down
                lst.add(matrix[k][n - 1]);
            }
            n--;
 
            if (i < m) {
                for (k = n - 1; k >= j; --k) {//right to left
                    lst.add(matrix[m - 1][k]);
                }
                m--;
            }
 
            if (j < n) {
                for (k = m - 1; k >= i; --k) { //down to up
                    lst.add(matrix[k][j]);
                }
                j++;
            }
        }
        return lst;
    }
}