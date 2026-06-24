class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        array1 = []
        array2 = []

        if(len(s) != len(t)):
            return False
            
        for i in range(len(s)):
            array1.append(s[i])
            array2.append(t[i])

        
            


    
        array1.sort()
        array2.sort()
        if array1 == array2:
            return True
        else:
            return False 


        


