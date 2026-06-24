class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        array1 = []
        array2 = []
        for i,j in enumerate(s):
            array1.append(j)

        for i,j in enumerate(t):
            array2.append(j)


    
        array1.sort()
        array2.sort()
        if array1 == array2:
            return True
        else:
            return False 


        


