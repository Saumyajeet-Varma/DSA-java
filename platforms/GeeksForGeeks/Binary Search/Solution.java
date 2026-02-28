class Solution {
    public int binarysearch(int[] arr, int k) {
        
        int n = arr.length;
        
        int l = 0;
        int r = n - 1;
        
        int result = -1;
        
        while(l <= r) {
            
            int m = l + (r - l) / 2;
            
            if(arr[m] < k) {
                l = m + 1;
            }
            else if(arr[m] > k) {
                r = m - 1;
            }
            else {
                result = m;
                r = m - 1;
            }
        }
        
        return result;
    }
}