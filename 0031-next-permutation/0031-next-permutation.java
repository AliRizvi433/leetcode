class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 1;
        int pivot = -1;
        while(i > 0 && pivot == -1){
            if(nums[i] > nums[i-1]){
                pivot = i - 1;
            }
            i--;
        }
        if(pivot == -1){
            i = 0;
            int j = nums.length - 1;
            while(i < j){
                nums[i] = nums[i] + nums[j];
                nums[j] = nums[i] - nums[j];
                nums[i] = nums[i] - nums[j];
                i++;
                j--;
            }
        }

        else{
            i = nums.length - 1;
            while(i > pivot){
                if(nums[i]>nums[pivot]){
                    nums[i] = nums[pivot] + nums[i];
                    nums[pivot] = nums[i] - nums[pivot];
                    nums[i] = nums[i] - nums[pivot];
                    break;
                }
                i--;
            }

            i = pivot + 1;
            int j = nums.length - 1;
            while(i < j){
                nums[i] = nums[j] + nums[i];
                nums[j] = nums[i] - nums[j];
                nums[i] = nums[i] - nums[j];
                i++;
                j--;
            }

        }
    }
}