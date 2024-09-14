class Solution(object):
    def isPalindrome(self, s):
        n=""
        for i in range(len(s)):
            if s[i].isalpha() or s[i].isdigit():
                n+=s[i].lower()
        print(n)
        if n==n[::-1]:
            return True
        return False  
        