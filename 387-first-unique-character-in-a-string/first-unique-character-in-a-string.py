class Solution:
    def firstUniqChar(self, s: str) -> int:
        freq={}

        for i in s:
            freq[i]=freq.get(i,0)+1
        idx=""
        for i in freq:
            if(freq[i]==1):
                idx=i
                break
        for i in range(len(s)):
            if(s[i]==idx):
                return i
        return -1

                