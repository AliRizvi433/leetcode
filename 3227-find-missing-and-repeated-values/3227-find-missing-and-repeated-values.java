class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length * grid.length;
        int[] count = new int[n  + 1];
        int[] ans = new int[2];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                count[grid[i][j]]++;
            }
        }

        for(int i = 1; i < n + 1; i++){
            if(count[i] == 2){
                ans[0] = i;
            }
            if(count[i] == 0){
                ans[1] = i;
            }
        }

        return ans;
    }
}