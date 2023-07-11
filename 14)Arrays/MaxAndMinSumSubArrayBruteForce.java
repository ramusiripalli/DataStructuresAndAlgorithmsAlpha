//Brute Force  Tc 0(n^3)
public class Main {

    public static void printMaxAndMinSumSubArrays(int[] arrays) {
        int maximumSumSubArray = Integer.MIN_VALUE;
        int minimumSumSubArray = Integer.MAX_VALUE;
        int size = arrays.length;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                int subArraySum = 0;
                for (int k = i; k <= j; k++) {
                    subArraySum += arrays[k];
                }
                if (subArraySum > maximumSumSubArray) {
                    maximumSumSubArray = subArraySum;
                }
                if (subArraySum < minimumSumSubArray) {
                    minimumSumSubArray = subArraySum;
                }
            }
        }
        System.out.println("Maximum subarray sum is " + maximumSumSubArray);
        System.out.println("Minimum Sub Array sum is : " + minimumSumSubArray);

    }

    public static void main(String[] args) {
        int[] numbers = { 1, -2, 6, -1, 3 };
        printMaxAndMinSumSubArrays(numbers);
    }
}

/*
 * output:
 * Maximum subarray sum is 8
 * Minimum Sub Array sum is : -2
 */
