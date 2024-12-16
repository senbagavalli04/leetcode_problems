class Solution(object):
    def longestPalindrome(self, s):
        res=""
        reslen=0
        for i in range(0,len(s)):
            st=i
            en=i
            while st>=0 and en<len(s) and s[st]==s[en]:
                if en-st+1 > reslen:
                    res=s[st:en+1]
                    reslen=en-st+1
                st-=1
                en+=1
            st=i
            en=i+1
            while(st>=0 and en<len(s) and s[st]==s[en]):
                if en-st+1 > reslen:
                    res=s[st:en+1]
                    reslen=en-st+1
                st-=1
                en+=1
        return res