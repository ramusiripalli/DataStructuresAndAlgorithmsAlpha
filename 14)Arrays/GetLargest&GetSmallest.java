//get Largest and get Smallest values in the array

import java.util.*;

public class Main {
    // get Largest Element in the Array
    public static int getLargest(int[] nums) {
        int size = nums.length;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }
 // Get smallest Element in the array
    public static int getSmallest(int[] nums) {
        int size = nums.length;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] array = { 25, 43, 22, 11, 98, 1255, 5322 };
        System.out.println(" Largest is : [25,43,22,11,98,1255,5322] : " + getLargest(array));
        System.out.println("The smallest in the array is : " + getSmallest(array));

    }
}
