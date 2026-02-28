class Solution {
    private int[] reverse(int[] nums, int start, int end) {
        
        int l = start;
        int r = end - 1;

        while(l < r) {
            
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;

            l++;
            r--;
        }

        return nums;
    }

    public void rotate(int[] nums, int k) {
        
        int n = nums.length;

        k = k % n;

        nums = reverse(nums, 0, n);
        nums = reverse(nums, 0, k);
        nums = reverse(nums, k, n);
    }
}