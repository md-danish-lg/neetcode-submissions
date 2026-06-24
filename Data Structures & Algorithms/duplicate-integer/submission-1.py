class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:

        hash_tab = {}



        

        for i in range(len(nums)):
            if nums[i] in hash_tab:
                return True
            else:
                hash_tab[nums[i]] = i





           
        
        return False
