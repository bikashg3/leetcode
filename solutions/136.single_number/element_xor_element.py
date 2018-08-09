class Solution:
    def singleNumber(self, arr):
        """
        :type nums: List[int]
        :rtype: int
        """
        res = arr[0]
        for i in range(1,len(arr)):
            res = res ^ arr[i]
        return res
