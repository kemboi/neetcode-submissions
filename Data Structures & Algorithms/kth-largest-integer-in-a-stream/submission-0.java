class KthLargest {
    Queue<Integer> minHeap = new PriorityQueue<Integer>();
    int k;
    public KthLargest(int k, int[] nums) {
     this.k = k;
      for(int num: nums){
        add(num);
      } 
    }
    
    public int add(int val) {
       this.minHeap.offer(val);
        if(minHeap.size()>k){
            minHeap.poll();
        }
       return minHeap.peek();
    }
}
