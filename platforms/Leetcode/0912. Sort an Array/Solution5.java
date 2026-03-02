// Quick Sort
// ! Time Limit Exceed
class Solution5 {

    private int partition(int[] nums, int l, int r) {

        int pivot = nums[r];

        int i = l - 1;

        for(int j = l; j < r; j++) {
            if(nums[j] < pivot) {
                
                i++;
                
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int temp = nums[r];
        nums[r] = nums[i + 1];
        nums[i + 1] = temp;

        return i + 1;
    }

    private void quickSort(int[] nums, int l, int r) {

        if(l >= r) {
            return;
        }

        int p = partition(nums, l, r);

        quickSort(nums, l, p - 1);
        quickSort(nums, p + 1, r);
    }

    public int[] sortArray(int[] nums) {
        
        int n = nums.length;

        quickSort(nums, 0, n - 1);

        return nums;
    }
}