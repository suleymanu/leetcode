class Solution:
    def answerQueries(self, nums: List[int], queries: List[int]) -> List[int]:
        nums.sort()
        l = []
        for q in queries:
            su = 0
            i = 0
            for n in nums:
                su += n
                if su > q: break
                i += 1
            l.append(i)
        return l
