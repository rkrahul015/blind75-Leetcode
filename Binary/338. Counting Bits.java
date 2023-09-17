class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i=0; i<=n; i++) {
            res[i] = (i & 1) + res[i>>1];
        }   
        return res;
    }
}