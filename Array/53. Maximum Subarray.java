class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere=0;
        for(int i=0; i<nums.length; i++) {
            int num= nums[i];
            maxEndingHere += num;
            if(maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
            }
            if(maxEndingHere < 0)
                maxEndingHere=0;
        }
        return maxSoFar;
    }
}