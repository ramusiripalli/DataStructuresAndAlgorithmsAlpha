// Reverse of the number T.c = 0(N) ; s.c = 0(1);

public class Main {
    // Approach 1
    public static void reverseNumbers(int[] nums) {
        int n = nums.length;
        int start = 0;
        int last = n - 1;
        while (start < last) {
            int temp = nums[last];
            nums[last] = nums[start];
            nums[start] = temp;
            start++;
            last--;
        }
    }

    // Approach 2
    public static void reverseArray(int[] nums) {
        int size = nums.length;
        for (int i = 0; i <= size / 2; i++) {
            int temp = nums[size - i - 1];
            nums[size - i - 1] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10, 12 };
        // for approach 1
        reverseNumbers(numbers);
        // for approach 2
        reverseArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
