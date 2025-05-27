class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output =  new int[nums.length];
        int res = 1;
        int countZero = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] == 0){
                countZero++;                
            }
            else{
                res = res * nums[i];
            }
        }

        for(int i = 0; i<output.length;i++){
            if(countZero>1){
                output[i] = 0;
            }
            else if(countZero == 1){
                output[i] = nums[i]==0?res:0;
            }
            else{
                output[i] = res/nums[i];
            }
        }

        return output;
    }
}  
