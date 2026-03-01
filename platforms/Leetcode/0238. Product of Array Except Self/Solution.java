class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;

        int result[] = new int[n];

        int prod = 1;
        int count = 0;
        
        for(int i = 0; i < n; i++) {

            if(nums[i] != 0) {
                prod *= nums[i];
            }
            else {
                count++;
            }
        }

        if(count > 1) {
            for(int i = 0; i < n; i++) {
                result[i] = 0;;
            }
        }
        else if(count == 1) {
            for(int i = 0; i < n; i++) {
                
                result[i] = 0;

                if(nums[i] == 0) {
                    result[i] = prod;
                }
            }
        }
        else {
            for(int i = 0; i < n; i++) {
                result[i] = prod / nums[i];
            }
        }

        return result;
    }
}