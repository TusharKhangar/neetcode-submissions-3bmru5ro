class Solution {
    public int longestConsecutive(int[] nums) {
        // 2,20,4,10,3,4,5
        // creating a map where we find if num+1 exist or not;
        // eg taking num[i] and put it into the map;
        //creating a local variable nextExist { incrementing it if any num+1 is found } resets to zero and 
        //passing the value to a global variable.
        //at num[i] we check if num[i]+1 exist we increment 
        // num goes at num[i+1] condition fails it looks for that element 
        // we could use sorting in O(n log n) time complexity.
        // okay we have sorted the element now the elements are in ascending order
        //[2,,4,4,5,10,20] = sortedArray()
        //if there are duplicates you can bypass them we will use continue for now;
        // hit3ting 10 break the loop we start over in the hashmap [ now i think we don't even need a hashmap]
        //we can just use the array or hashset; 
        // we clear the set, when we find the number greater than num+1; 
        // we calculate size(); before clearing the hashset(); for frequency of longest consecutive subsequence
       Set<Integer> set = new HashSet<>();
       for(int n : nums){
        set.add(n);
       }
       int longest = 0;
       for(int n : nums){
        // int currentStreak = 1;
        if(!set.contains(n-1)){
            int currentNum = n;
            int currentStreak = 1;
            while(set.contains(currentNum+1)){
                currentNum++;
                currentStreak++;
            }
            longest = Math.max(longest,currentStreak);
        }
       }
       return longest;
    }
}
