class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for indexno, num in enumerate(nums):
            pair = target - num
            if pair in nums[indexno + 1:]:
                return [indexno, nums.index(pair, indexno + 1)]
        return None
