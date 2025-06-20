class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        for(int i = 0, j = i + 1; i < arr.length && j < arr.length; i++, j++){
            if(arr[i]>arr[j]){
                return i;
            }

        }
        return -1;
    }
}