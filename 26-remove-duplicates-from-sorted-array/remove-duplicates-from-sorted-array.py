class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        set1=set()
        k=0
        for i in nums:
            if(i in set1):
                continue
            else:
                nums[k]=i
                k+=1
                set1.add(i)
        return k
