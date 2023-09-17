class Solution {
    public int missingNumber(int[] nums) {
        int ans = 0 ^ nums[0];
        for(int i=1; i<nums.length; i++) {
            ans = ans ^ i ^ nums[i];
        }
        ans=ans^nums.length;
        return ans;
    }
}