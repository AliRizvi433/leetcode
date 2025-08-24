class Solution {
    public int uniquePaths(int m, int n) {
        int[] mat = new int[n];

        for(int i = 0; i < n; i++){
            mat[i] = 1;
        }

        for(int i = 1; i < m ; i++){
            for(int j = 1; j < n; j++){
                mat[j] = mat[j] + mat[j-1];
            }
        }
        return mat[n-1];
    }
}