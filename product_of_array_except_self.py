class Solution(object):
    def productExceptSelf(self, nums):
        n=len(nums)
        if n==0:
            return nums
        pre=[None]*n
        post=[None]*n
        pre[0]=nums[0]
        post[n-1]=nums[n-1]
        for i in range(1,n):
            pre[i]=pre[i-1]*nums[i]
        for i in range(n-2,-1,-1):
            post[i]=post[i+1]*nums[i]
        for i in range(0,n):
            prev= pre[i-1] if i!=0 else 1
            postv= post[i+1] if i!=n-1 else 1
            nums[i]=prev*postv
        return nums

