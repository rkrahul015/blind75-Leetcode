class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int countOfZero=0;

        for(int i:nums) {
            if(i==0) {
                countOfZero++;
                continue;
            }
            prod *=i;
        }
        if(countOfZero >1)
            Arrays.fill(nums,0);
        else    
            for(int i=0; i<nums.length; i++) {
                
                if(countOfZero == 1) {
                    if(nums[i] != 0)
                        nums[i] =0;
                    else 
                        nums[i] = prod;
                }        
                else
                    nums[i] = prod/nums[i];    
            }
        return nums;
    }
}