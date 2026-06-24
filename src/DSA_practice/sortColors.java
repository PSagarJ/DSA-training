package DSA_practice;

import java.util.Arrays;

public class sortColors {
    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap mid with low, then move both pointers forward
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // 1 is already in the correct middle zone, just move mid forward
                mid++;
            } else if (nums[mid] == 2) {
                // Swap mid with high, move high backward.
                // Do NOT move mid forward yet because the swapped element needs to be checked.
                swap(nums, mid, high);
                high--;
            }
        }
    }

    // Helper method to swap two elements in an array
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        System.out.println("Before sorting: " + Arrays.toString(nums));
        sortColors(nums);
        System.out.println("After sorting:  " + Arrays.toString(nums));
    }
}
