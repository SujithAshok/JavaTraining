import java.util.Random;

public class KthLargestElement {

    public static int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 1 || k > nums.length) {
            throw new IllegalArgumentException("Invalid input");
        }
        int left = 0;
        int right = nums.length - 1;
        Random random = new Random();

        while (left <= right) {
            int pivotIndex = partition(nums, left, right, random);
            if (pivotIndex == nums.length - k) {
                return nums[pivotIndex];
            } else if (pivotIndex < nums.length - k) {
                left = pivotIndex + 1;
            } else {
                right = pivotIndex - 1;
            }
        }
        return -1;
    }

    private static int partition(int[] nums, int left, int right, Random random) {
        int pivotIndex = left + random.nextInt(right - left + 1);
        int pivotValue = nums[pivotIndex];
        swap(nums, pivotIndex, right);
        int i = left;
        for (int j = left; j < right; j++) {
            if (nums[j] < pivotValue) {
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, i, right);
        return i;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int kthLargest = findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is: " + kthLargest);
    }
}