class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int left = 0;
        for(int right = 0; right < nums.length ; right++){
            if(right - left > k){
                set.remove(nums[left]);
                left++;
            }
            if(set.add(nums[right])){
                set.add(nums[right]);
            }else {
                return true;
            }
        }
        return false;
    }
}