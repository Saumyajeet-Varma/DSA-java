class Solution {
    public int getSecondLargest(int[] arr) {
        
        int n = arr.length;
        
        int maxx = -1;
        int secondMaxx = -1;
        
        for(int i = 0; i < n; i++) {
            
            if(arr[i] > maxx) {
                secondMaxx = maxx;
                maxx = arr[i];
            }
            else if(arr[i] > secondMaxx && arr[i] != maxx) {
                secondMaxx = arr[i];
            }
        }
        
        return secondMaxx;
    }
}