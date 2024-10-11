class Solution(object):
    def nextGreaterElement(self, nums1, nums2):
        res=[-1]*len(nums1)
        for i in range(len(nums1)):
            j=len(nums2)-1
            great=-1
            while(j>=0 and nums1[i]!=nums2[j]):
                if(nums2[j]>nums1[i]):
                    great = nums2[j]
                j-=1
            res[i]=great
        return res