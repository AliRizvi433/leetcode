class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0;
        int candidate1 = 0, candidate2 = 0;

        List<Integer> res = new ArrayList<>();

        for(int x: nums){
            if(candidate1 == x)
            count1++;

            else if(candidate2 == x)
            count2++;

            else if(count1 == 0){
                candidate1= x;
                count1++;
            }

            else if(count2 == 0){
                candidate2 = x;
                count2++;
            }
            
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;

        for(int x: nums){
            if(x == candidate1)
            count1++;
            else if(x == candidate2)
            count2++;
        }

        int n = nums.length;

        if(count1 > n/3)
        res.add(candidate1);

        if(count2 > n/3)
        res.add(candidate2);
        
        return res;
    }
}