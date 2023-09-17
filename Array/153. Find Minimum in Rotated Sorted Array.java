class Solution {
    public int findMin(int[] nums) {
       int ans = Integer.MAX_VALUE;
       int low = 0, high = nums.length-1;
       while(low <= high) {
           int mid = low  + (high-low)/2;
           if(nums[mid] <= nums[high]) {
                high = mid-1;
                ans = Math.min(ans,nums[mid]);
           }
           else if(nums[mid] >= nums[low]) {
                ans = Math.min(ans,nums[low]);
                low = mid+1;
           }
       } 
       return ans;
    }
}