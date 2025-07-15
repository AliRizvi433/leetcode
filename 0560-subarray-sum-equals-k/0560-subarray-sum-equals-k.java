class Solution {
    public int subarraySum(int[] nums, int k) {
        int count  = 0;
        Map<Integer, Integer> sumCount = new HashMap<>();

        int preFix = 0;
        sumCount.put(0,1);

        for(int i = 0; i < nums.length; i++){
            preFix += nums[i];

            int target = preFix - k;
            if(sumCount.containsKey(target)){
                count += sumCount.get(target);
            }
            sumCount.put(preFix, sumCount.getOrDefault(preFix, 0) + 1);
        }

        return count;
    }
}