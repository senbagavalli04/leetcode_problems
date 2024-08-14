class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        nums1=nums1+nums2
        print(nums1)
        nums1.sort()
        print(nums1)
        n=len(nums1)
        mid=n/2
        if n%2==0:
            val=((nums1[mid-1]+nums1[mid])/2.0)
            return val
        else:
            return nums1[mid]
            
