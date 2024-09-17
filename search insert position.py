class Solution(object):
    def searchInsert(self, nums, target):
        #717822I152-Senbagavalli N
        left=0 
        right=len(nums)-1 
        b=right
        while (left<=right): 
            mid=(left+right)/2 
            if nums[mid]>target:
                right=mid-1
            elif target>nums[mid]: 
                left=mid+1
            else:
                return mid 
        return left