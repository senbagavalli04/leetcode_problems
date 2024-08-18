class Solution(object):
    def reverse(self, x):
        if x>=0:
            sign=1
        else:
            sign=-1
        copy=abs(x)
        rev=0
        while copy>0:
            rev=rev*10+(copy%10)
            copy//=10
        ans=sign*rev
        if ans < -2**31 or ans > 2**31-1:
            return 0
        return ans

            