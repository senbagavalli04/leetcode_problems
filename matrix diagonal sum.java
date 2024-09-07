class Solution {
    public int diagonalSum(int[][] mat) {
        int s=0;
        int n=mat.length;
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if (i==j){
                s+=mat[i][j];
            }
            else if (i==n-1-j){
                s+=mat[i][j];
            }
        }
       }
       return s;
    }
}