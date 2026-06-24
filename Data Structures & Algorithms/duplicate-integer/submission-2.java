class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> d = new HashSet<>();

        for(int num: nums){
            d.add(num);
        }

        if(d.size() == nums.length){
            return false;
        }
        return true;
    }
}