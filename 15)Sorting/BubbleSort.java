/*
Bubble Sort Algorithm
Problem Statement: Given an array of N integers, write a program to implement the Bubble Sorting algorithm.

*/

public class Main {

    public static void bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            // for optimization best time complexity i am adding flag
            int didswap = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                    didswap = 1;
                }
            }
            if (didswap == 0) {
                break;
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
        int array[] = { 1, 2, 3, 4, 5 };
        bubbleSort(array);
        printArray(array);

    }
}
