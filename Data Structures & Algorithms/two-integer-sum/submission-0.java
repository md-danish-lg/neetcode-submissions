

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hashes = new HashMap<>();
        int[] solution = new int[2];


        for(int i=0; i < nums.length; i++){
            int difference = target - nums[i];
            if (hashes.containsKey(difference)){
                solution[0]= hashes.get(difference);
                solution[1]=i;
                return solution;

            }
            hashes.put(nums[i], i);
        }
        return solution;
    }
}
