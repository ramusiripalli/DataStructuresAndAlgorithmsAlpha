//Insertion Sort

public class Main {

    public static void insertionSort(int[] nums) {
        int n = nums.length;
        // i needs to be i<n-1 always and j>0 and j=i+1 keep in mind
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    // swap
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 9, 1 };
        insertionSort(arr);
        printArray(arr);
    }
}
