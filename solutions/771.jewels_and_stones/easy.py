class Solution:
    def numJewelsInStones(self, J, S):
        """
        :type J: str
        :type S: str
        :rtype: int
        """
        res = 0
        for i in (list(S)):
            if i in (list(J)):
                res=res+1
        return res
