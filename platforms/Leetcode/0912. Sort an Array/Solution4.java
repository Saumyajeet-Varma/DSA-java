// Merge Sort
class Solution4 {

    private void merge(int[] nums, int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for(int i = 0; i < n1; i++) {
            left[i] = nums[l + i];
        }

        for(int j = 0; j < n2; j++) {
            right[j] = nums[m + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while(i < n1 && j < n2) {

            if(left[i] < right[j]) {
                nums[k] = left[i];
                i++;
            }
            else {
                nums[k] = right[j];
                j++;
            }

            k++;
        }

        while(i < n1) {
            
            nums[k] = left[i];

            i++;
            k++;
        }

        while(j < n2) {

            nums[k] = right[j];

            j++;
            k++;
        }
    }

    private void mergeSort(int[] nums, int l, int r) {

        if(l >= r) {
            return;
        }

        int m = l + (r - l) / 2;

        mergeSort(nums, l, m);
        mergeSort(nums, m + 1, r);

        merge(nums, l, m, r);
    }

    public int[] sortArray(int[] nums) {
        
        int n = nums.length;

        mergeSort(nums, 0, n - 1);

        return nums;
    }
}