#link : https://www.geeksforgeeks.org/problems/count-ways-to-reach-the-nth-stair-1587115620/1
class Solution:
    def countWays(self, n):
        dp=[0]*(n+1)
        dp[1]=1
        dp[2]=2
        for i in range(3,n+1):
            dp[i] = dp[i-1]+dp[i-2]
        return dp[n]
