class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        // creating a list of buckets for storing the frequency, how many times a number has occured
        List<Integer>[] freq = new List[nums.length+1];
        for(int i = 0; i <= nums.length; i++){
            freq[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        int [] result = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i >= 0 && index < k; i--) {
            for (int num : freq[i]) {
                result[index++] = num;
                if (index == k) break;
            }
        }
        return result;
    }
}
