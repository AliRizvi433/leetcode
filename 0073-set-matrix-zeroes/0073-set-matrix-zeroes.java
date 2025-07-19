class Solution {
    public void setZeroes(int[][] matrix) {
        boolean colZ = false, rowZ = false;
        int m = matrix.length;
        int n = matrix[0].length;

        for(int j = 0; j < n; j++){
            if(matrix[0][j] == 0){
                rowZ = true;
                break;
            }
        }

        for(int i = 0; i < m; i++){
            if(matrix[i][0] == 0){
                colZ = true;
                break;
            }
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(colZ == true){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }

        if(rowZ == true){
            for(int j = 0; j < n; j++){
                matrix[0][j] = 0;
            }
        }
    }
}