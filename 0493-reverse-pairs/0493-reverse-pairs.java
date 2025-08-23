class Solution {
    public int reversePairs(int[] nums) {
        // int count = 0;
        // long arr[] =  new long[nums.length];

        // for(int i = 0; i < nums.length; i++){
        //     arr[i] = nums[i];
        // }

        return (int)mergeSortAndCount(nums, 0, nums.length - 1);
    }

    public long mergeSortAndCount(int[] nums, int l, int h){
        long count = 0;

        if(l < h){
            int m = l + (h-l)/2;

            count += mergeSortAndCount(nums, l, m);
            count += mergeSortAndCount(nums, m+1, h);
            count += mergeAndCount(nums, l ,m, h);
        }

        return count;
    }

    public long mergeAndCount(int[] nums, int l, int m, int h){
        long count  = 0;

        int j = m + 1;
        for(int i = l; i <= m; i++){
            while(j <= h && nums[i] > 2L*nums[j]){
                j++;
            }
            count += (j - (m + 1));
        }

        int n1 = m - l + 1;
        int n2 = h - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0; i < n1; i++){
            L[i] = nums[i+l];
        }

        for(j = 0; j < n2; j++){
            R[j] = nums[j + m + 1];
        }
        int i = 0, k = l;
        j = 0;
        while(i<n1 && j<n2){
            if(L[i]<R[j]){
                nums[k++] = L[i++];
            }
            else{
                nums[k++] = R[j++];
            }
        }

        while (i < n1) nums[k++] = L[i++];
        while (j < n2) nums[k++] = R[j++];


        return count;
    }
}