class Solution {
    // Memoization
    // public int longestCommonSubsequence(String text1, String text2) {
    //     int n1 = text1.length();
    //     int n2 = text2.length();
    //     char[] s1 = text1.toCharArray();
    //     char[] s2 = text2.toCharArray();
    //     int[][] dp = new int[n1][n2];
    //     for(int[] rows : dp){
    //         Arrays.fill(rows,-1);
    //     }
    //     return lcs(n1-1,n2-1,s1,s2,dp);
    // }
    // public int lcs(int idx1, int idx2, char[] s1, char[] s2,int[][] dp) {
    //     if(idx1 < 0 || idx2 <0)
    //         return 0;
    //     if(dp[idx1][idx2] != -1)
    //         return dp[idx1][idx2];    
    //     if(s1[idx1] == s2[idx2])
    //         dp[idx1][idx2] = 1 + lcs(idx1-1, idx2-1, s1, s2,dp);
    //     else
    //         dp[idx1][idx2] = Math.max(lcs(idx1-1,idx2,s1,s2,dp) , lcs(idx1, idx2-1, s1, s2,dp)); 
    //     return dp[idx1][idx2];           
    // }
    

    // tabulation
    public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length();
        int n2 = text2.length();
        char[] s1 = text1.toCharArray();
        char[] s2 = text2.toCharArray();
        int[][] dp = new int[n1+1][n2+1];
        for(int i=1; i<=n1; i++) {
            for(int j=1; j<=n2; j++) {
                if(s1[i-1] == s2[j-1])
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);    
            }
        }
        return dp[n1][n2];
    }
}