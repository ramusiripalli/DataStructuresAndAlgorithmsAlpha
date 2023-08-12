/*
Selection Sort Algorithm
Problem Statement: Given an array of N integers, write a program to implement the Selection sorting algorithm.
*/
public class Main {

    public static void selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int minimumPosition = i;
            // here j loop needs to be j<n be careful and j needs to be i+1
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minimumPosition]) {
                    minimumPosition = j;
                }
            }
            int temp = nums[minimumPosition];
            nums[minimumPosition] = nums[i];
            nums[i] = temp;
        }
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = { 34, 23, 21, 1, 2, 3, 4 };
        selectionSort(array);
        printArray(array);

    }
}



//output: 1 2 3 4 21 23 34 
