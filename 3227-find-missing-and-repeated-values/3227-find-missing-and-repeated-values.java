class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long n = grid.length;
        long N = n * n;

        long sum = 0;
        long sumSq = 0;

        for(int[] row: grid){
            for(int x: row){
                sum += x;
                sumSq += x*x;
            }
        }

        long s1 = (N * (N+1))/ 2;
        long s2 = (N * (N+1) * (2*N + 1))/ 6;

        long aMinusB = sum - s1;
        long aMinusbSq = sumSq - s2;

        long aPlusb = aMinusbSq/aMinusB;

        long a = (aMinusB + aPlusb) / 2;
        long b = aPlusb - a;

        return new int[]{(int)a, (int)b};
    }
}