class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        // transposing
        int i;
        int j;
        /*while(i<n){
            j=0;
            while(j<i){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                j++;
            }
            i++;
        }*/
        for (i=0;i<n;i++){
            for(j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //System.out.println(matrix);
        // row wise reverse
       for(i=0;i<n;i++){
            int s=0;
            int e=n-1;
            while(s<e){
                int temp=matrix[i][s];
                matrix[i][s]=matrix[i][e];
                matrix[i][e]=temp;
                s++;
                e--;
            }
        }
      System.out.println(matrix);
    }
}