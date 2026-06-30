class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums){
            pq.offer(i);
        }
        int val = pq.size() - (k-1);
        int loop = pq.size();
        while(loop > val){
            pq.poll();
            loop--;
        }
        return pq.peek();
    }
}
