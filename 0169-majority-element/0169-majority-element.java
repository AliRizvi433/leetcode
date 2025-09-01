class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        for(int x: nums){
            if(candidate == x){
                count++;
            }

            else if(candidate != x){
                count --;
            }

            if(count == 0){
                candidate = x;
                count++;
            }
        }

        return candidate;
    }
}