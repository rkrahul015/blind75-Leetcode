// class Solution {
//     public int lengthOfLIS(int[] nums) {
//         int n = nums.length;
//         int[][] dp = new int[n+1][n]; //[idx][prev]
//         for(int[] rows : dp)
//             Arrays.fill(rows,-1);
//         return helper(0,-1,nums,dp);
//     }
//     //Memoization
//     public int helper(int idx,int prev, int[] nums,int[][] dp) {
//         if(idx == nums.length)
//             return 0;
//         if(dp[idx][prev+1] != -1) return dp[idx][prev+1];    
//         int notpick = helper(idx+1,prev,nums,dp);
//         int pick=0;
//         if(prev == -1 || nums[idx] > nums[prev])
//             pick = 1 + helper(idx+1,idx,nums,dp);
//         return dp[idx][prev+1] = Math.max(pick,notpick);    
//     }
// }

// Using Binary Search
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> al = new ArrayList<>();
        al.add(nums[0]);
        for(int i=1; i<n; i++) {
            int num = nums[i];
            if(al.get(al.size()-1) < num)
                al.add(num);
            else {
                int idx = Collections.binarySearch(al,num);
                if(idx < 0)
                    idx = -(idx+1);
                al.set(idx,num);    
            }       
        } 
        return al.size();  
    }
}