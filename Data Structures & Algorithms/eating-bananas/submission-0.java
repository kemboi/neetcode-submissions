class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int l = 1;
      int r = Arrays.stream(piles).max().getAsInt(); 
      while (l <= r){
        int mid = l + (r - l) / 2;
        if(canEatBananas(piles, h, mid)){
            r = mid - 1;
        }
        else {
            l = mid + 1;
        }
      } 
      return l;
    }
    boolean canEatBananas(int[] piles, int h, int mid){
        double totalHours = 0;
        for ( int pile: piles){
            totalHours += Math.ceil((double) pile / mid);
           
        }
         return totalHours <= h;
    }
}
