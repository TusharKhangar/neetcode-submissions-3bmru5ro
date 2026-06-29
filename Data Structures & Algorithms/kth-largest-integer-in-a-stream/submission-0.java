class KthLargest {
    private int k;
    private PriorityQueue<Integer> queue;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>();
        for(int i : nums){
            add(i);
        }
    }
    
    public int add(int val) {
        queue.offer(val);
        if(queue.size() > k){
            queue.poll();
        }
        return queue.peek();
    }
}
