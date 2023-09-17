class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        // Map --> nums[i] and its position
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int num = nums[i];
            if(hm.containsKey(target-num)) {
                res[0] =i;
                res[1] = hm.get(target-num);
            }
            else
                hm.put(num,i);
        }

        int temp=0;
        if(res[0]<res[1]){
            temp =res[0];
            res[0] =res[1];
            res[1] =temp;
        }
        return res;
    }
}