class Solution(object):
    def sortColors(self, nums):
        l=0
        r=0
        s=len(nums)-1
        while(l<=s):
            if nums[l]==2:
                temp=nums[l]
                nums[l]=nums[s]
                nums[s]=temp
                s-=1
            elif nums[l] == 0:
                temp=nums[l]
                nums[l]=nums[r]
                nums[r]=temp
                l+=1
                r+=1
            else:
                l+=1
        
        