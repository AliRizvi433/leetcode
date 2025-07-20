class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int k = 0;
        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 0){
                k = 0;
                continue;
            }

            k++;
            max = max>k?max:k;
        }
        
        return max;
    }
}