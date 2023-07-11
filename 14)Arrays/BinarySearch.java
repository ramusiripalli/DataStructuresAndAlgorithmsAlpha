// Binary search

public class Main {
    public static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
        int target = 14;

        System.out.println("The target fount at index : " + binarySearch(arr, target));
    }
}
