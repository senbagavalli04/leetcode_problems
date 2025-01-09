//CODE LINK : https://leetcode.com/problems/search-a-2d-matrix/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 1){
        if(target == matrix[0][0]) return true;
        else {
           boolean res= bin(matrix[0],target);
           if (res == true) return true;
        }
     return false;
        }
 
        
       for(int i=0;i<matrix.length;i++){
        if(bin(matrix[i],target) == true){
            return true;
        }
       }
     return false;

    }
    boolean bin(int[] row, int target){
        int l = 0;
        int r = row.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(row[mid] == target) return true;
            else if(row[mid] > target){
                r= mid-1;
            }
            else
            l = mid+1;
        }
  return false;
    }
}
