class Solution:
    def firstUniqChar(self, s: str) -> int:
        freq={}

        for i in s:
            freq[i]=freq.get(i,0)+1
        idx=""
        for i,j in enumerate(s):
            if(freq[j]==1):
                
                return i
       
        return -1

                