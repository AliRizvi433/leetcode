class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hash.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int k = target - nums[i];
            if (hash.containsKey(k) && hash.get(k)!= i) {
                return new int[] {i, hash.get(k)};
            }
        }

        return new int[0];

    }
}