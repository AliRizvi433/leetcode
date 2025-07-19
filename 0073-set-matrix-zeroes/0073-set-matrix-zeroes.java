class Solution {
    public void setZeroes(int[][] matrix) {

        Set<Integer> rowC = new HashSet<>();
        Set<Integer> colC = new HashSet<>();


        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                rowC.add(i);
                colC.add(j);
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(rowC.contains(i) || colC.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}