class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int min = -1;
        int i = matrix.length - 1;
        int j = matrix[0].length - 1;
        while(i>=0){
            if(target <= matrix[i][j]){
                min = i;
            }
            else{
                break;
            }
            i--;
        }
        if(min == -1)
        return false;
        
        int mid = (j+1)/2;
        int l = 0;
        int r = j + 1;
        while(l<=r){
            int m = (l + r)/2;

            if(matrix[min][m] == target)
            return true;

            else if(matrix[min][m] > target){
                r = m - 1;
            }

            else{
                l = m + 1;
            }
        }
        return false;
    }
}