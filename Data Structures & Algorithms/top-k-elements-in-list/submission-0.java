class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num,0) + 1);
        }
        Queue<Integer> topK = new PriorityQueue<>(
                (a,b)-> freq.get(a) - freq.get(b)
        );
        for(int num : freq.keySet()){

            topK.offer(num);

            if(topK.size() > k){
                topK.poll();

            }
        }
        int[] result = new int[k];
       for ( int i = 0; i < k; i++){
            if(!topK.isEmpty()) {
                result[i] = topK.poll();
            }
       }
        return result;
    
        
    }
}
