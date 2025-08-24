class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(i == j)
                continue;
                matrix[j][i] = matrix[i][j] + matrix[j][i];
                matrix[i][j] = matrix[j][i] - matrix[i][j];
                matrix[j][i] = matrix[j][i] - matrix[i][j];
            }
        }

        for(int i = 0; i < n; i++){
            int j = 0; int k = n - 1;
            while(j < k){
                matrix[i][j] = matrix[i][j] + matrix[i][k];
                matrix[i][k] = matrix[i][j] - matrix[i][k];
                matrix[i][j] = matrix[i][j] - matrix[i][k];
                j++;
                k--;
            }
        }
        
    }
}