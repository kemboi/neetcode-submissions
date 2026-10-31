class Solution {
    public int search(int[] nums, int target) {

        // binary search algorithm that runs in the complexity of O(log n)

        int low = 0;
        int high = nums.length - 1;

        while (low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                    high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
        
    }
}
