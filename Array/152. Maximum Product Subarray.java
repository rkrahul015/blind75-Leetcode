class Solution {
    public int maxProduct(int[] nums) {
        int suffix=1, preffix=1;
        int n= nums.length;
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            if(suffix == 0)   suffix =1;
            if(preffix == 0)  preffix =1;
            suffix *= nums[i];
            preffix *= nums[n-1-i];
            ans = Math.max(ans,Math.max(suffix,preffix));
        }
        return ans;
    }
}