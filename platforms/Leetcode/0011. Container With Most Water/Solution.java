class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length;

        int l = 0;
        int r = n - 1;

        int water = 0;
        int maxWater = 0;

        while(l < r) {
            
            if(height[l] < height[r]) {
                water = (r - l) * height[l];
                maxWater = Math.max(maxWater, water);
                l++;
            }
            else {
                water = (r - l) * height[r];
                maxWater = Math.max(maxWater, water);
                r--;
            }
        }

        return maxWater;
    }
}