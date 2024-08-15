class Solution(object):
    def isPerfectSquare(self, num):
        left=0
        right=num 
        while(left<=right):
            mid=(left+right)//2 
            if mid*mid<num:
                left=mid+1 
            elif mid*mid>num:
                right=mid-1 
            else:
                return mid