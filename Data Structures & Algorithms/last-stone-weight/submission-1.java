class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones){
            queue.offer(i);
        }
        //we will remove the biggest value and second biggest value 
        int res = 0;
        while(queue.size() > 1){
            // fnl = queue.peek();
            int largest = queue.poll();
            if(!queue.isEmpty()) {
                int secondLargest = queue.poll();
                res = (largest - secondLargest > 0)?largest-secondLargest:0;
            }
            if(res != 0) queue.offer(res);
        }
        System.out.println(queue.size());
        if(queue.size() == 0) return res;
        return queue.peek();

        //difference b/w them and inserting the result`
    }
}
