public class Solution{
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] res = new int[n];
        int ans=0;
        res[n-1] =prices[n-1];
        int localMax = prices[n-1];
        for(int i=n-2;i>=0; i--) {
            if(prices[i] >= localMax){
                res[i] = prices[i];
                localMax = prices[i];
            }
            else {
                res[i] = localMax;
            }
        }
        
        for(int i=0; i<n; i++) {
            //System.out.print(res[i] + " ");
            ans = Math.max(ans,res[i]-prices[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));  
    } 
}
