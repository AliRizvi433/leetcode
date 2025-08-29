class Solution {
    public int[][] merge(int[][] intervals) {
        //sort the 2D array
        Arrays.sort(intervals, (a,b) -> (a[0]==b[0])?Integer.compare(a[1], b[1]):Integer.compare(a[0],b[0]));

        //create a List of Int arrays
        List<int[]> res = new ArrayList<>();

        //put value of first row as current and add current to the List
        int[] current = intervals[0];
        res.add(current);
        
        //actual logic
        for(int[] interval: intervals){
            if(interval[0] <= current[1]){
                //why usinfg Math.max below
                // Current = [1, 10]
                // Interval = [2, 6]
                // current[1] = interval[1] → [1, 6] ❌ (lost the "10")

                current[1] = Math.max(interval[1], current[1]);
            }
            else{
                current = interval;
                res.add(current);
            }
        }


        return res.toArray(new int[res.size()][]);


    }
}