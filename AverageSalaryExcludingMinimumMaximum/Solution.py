class Solution:
    def average(self, salary: List[int]) -> float:
        mi=salary[0]
        ma=salary[0]
        su=0
        for s in salary:
            if s<mi:
                mi=s
            if s>ma:
                ma=s
            su += s
        return (su-mi-ma)/(len(salary)-2)
