

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hashes = new HashMap<>();


        for(int i = 0; i<nums.length; i++){
            hashes.put(nums[i], i);
        }


        for(int i=0; i<nums.length; i++){
            int different = target - nums[i];
            if(hashes.containsKey(different) && hashes.get(different) != i){
                return new int[]{i, hashes.get(different)};
            }
        }


        return new int[0];
    }
}
