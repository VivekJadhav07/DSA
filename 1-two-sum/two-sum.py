class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict={
        }
        for i,j in enumerate(nums):
            t=target-j
            if( t in dict):
             return [i,dict[t]]
            else :
                dict[j]=i
        return [-1,-1]