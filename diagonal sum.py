#link : https://www.geeksforgeeks.org/problems/diagonal-sum0158/1
#O(n)
#User function Template for python3

class Solution:
	def DiagonalSum(self, mat):
	    n = len(mat)
	    s=0
	    for i in range(n):
	        s+= mat[i][i]
	        s+= mat[i][n-i-1]
	    return s 
	        
