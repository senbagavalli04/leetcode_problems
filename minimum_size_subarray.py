class Solution(object):
    def minSubArrayLen(self, target, nums):
        l=0
        r=0
        mini=float('inf')
        curr=0
        for r in range(len(nums)):
            curr+=nums[r]
            while curr>=target:
                mini = min(mini,r-l+1)
                curr-=nums[l]
                l+=1
        return mini if mini!=float('inf') else 0

