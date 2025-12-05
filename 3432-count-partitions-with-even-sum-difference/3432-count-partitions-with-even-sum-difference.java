class Solution {
    public int countPartitions(int[] nums) {

        int res = 0, preFix = 0;

        for (int x : nums) {
            preFix += x;
        }
        
        int before = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            before += nums[i];
            int temp = before - (preFix - before);
            if (temp % 2 == 0)
                res++;
        }

        return res;
    }
}