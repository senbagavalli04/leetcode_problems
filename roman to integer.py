class Solution(object):
    def romanToInt(self, s):
        d = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        t_sum = 0
        for i in range(len(s)-1):
            if d[s[i]]<d[s[i+1]]:
                t_sum-=d[s[i]]
            else:
                t_sum+=d[s[i]]
        t_sum+=d[s[-1]]
        return t_sum

            