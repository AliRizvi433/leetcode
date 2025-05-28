class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;
        int maxArea = 0;
        while(left<right){
            int area = (right - left) * Math.min(heights[right], heights[left]);
            maxArea = Math.max(area, maxArea);

            if(heights[left]>heights[right]){
                right--;
            }
            else{
                left++;
            }
        }

        return maxArea;
    }
}
