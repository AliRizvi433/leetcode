class Solution {
    public void sortColors(int[] nums) {
        // int[] freq = new int[3];

        // for(int x: nums){
        //     freq[x]++;
        // }

        // for(int i = 1; i < 3; i++){
        //     freq[i] += freq[i-1]; 
        // }

        // for(int i = 0; i < nums.length; i++){
        //     if(i < freq[0])
        //     nums[i] = 0;
            
        //     else if(i >= freq[0] && i < freq[1])
        //     nums[i] = 1;

        //     else{
        //         nums[i] = 2;
        //     }
        // }

        int left = 0, mid = 0, right = nums.length - 1;
        int temp;


        while(mid <= right){
            if(nums[mid] == 1){
                mid++;
            }

            else if(nums[mid] == 0){
                temp = nums[mid];
                nums[mid] = nums[left];
                nums[left] = temp;
                mid++;
                left++;
            }

            else if(nums[mid] == 2){
                temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
                right--;
            }
        }

    }
}