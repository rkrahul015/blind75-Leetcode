class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        if (s == null || s.length() == 0)
            return false;
  
        int n = s.length();  
        boolean[] dp = new boolean[n+1];
                dp[0]= true;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <i; j++) {
            String sub = s.substring(j, i );
            
            if (wordDict.contains(sub) && ( dp[j ])) {
                dp[i] = true;
                break;
            }
            }
        }
        
        return dp[n];
        
    }
}