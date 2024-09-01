from collections import defaultdict
class Solution(object):
    def groupAnagrams(self, strs):
        anagram_map=defaultdict(list)
        out=[]
        for i in strs:
            sorted_i = tuple(sorted(i))
            anagram_map[sorted_i].append(i)
        for val in anagram_map.values():
            out.append(val)
        return out

