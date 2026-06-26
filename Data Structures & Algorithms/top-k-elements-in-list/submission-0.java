class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> countOccurance = new HashMap<>();
        List<Integer>[] frequency = new List[nums.length + 1];


        for(int n: nums){
            countOccurance.put(n, countOccurance.getOrDefault(n,0) +1);
        }

        for(int i=0; i < frequency.length; i++){
            frequency[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry: countOccurance.entrySet()){
            frequency[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;

        for(int i=frequency.length - 1; i>0 && index < k; i--){
            for(int n: frequency[i]){
                res[index++] = n;
                if(index == k){
                    return res;
                }
            }
        }

        return res;
    }
}
