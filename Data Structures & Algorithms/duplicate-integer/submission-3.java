class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> d = new HashSet<>();

        for(int num: nums){
            if(!(d.add(num))) return true;
        }
        return false;

       
    }
}