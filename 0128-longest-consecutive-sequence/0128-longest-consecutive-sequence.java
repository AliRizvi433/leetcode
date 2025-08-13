class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLength = 0;

        Set<Integer> real =  new HashSet<>();

        for(int i: nums){
            real.add(i);
        }

        for(int i : nums){
            if(real.contains(i) && !real.contains(i - 1)){
                int curr = i;
                int length = 0;
                while(real.contains(curr)){
                    real.remove(curr);
                    length++;
                    curr++;
                }
                maxLength = (maxLength>length) ? maxLength: length;
            }
        }

        return maxLength;
    }
}