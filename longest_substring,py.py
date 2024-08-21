class Solution(object):
    def lengthOfLongestSubstring(self, s):
     
        a = [None] * (len(s) + 1)
        # print(a)
        for i in range(len(s)):
            if s[i] not in a:
                a[i] = s[i]

        non_none_a = [item for item in a if item is not None]
        c = non_none_a[0:3] 
        print(c)
        return len(c)