//Print sub Arrays
public class Main {

    public static void printSubArrays(int[] arrays) {
        int totalSubArrays = 0;
        int size = arrays.length;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arrays[k] + " ");

                }
                totalSubArrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The total subarrays are " + totalSubArrays);
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10 };
        printSubArrays(numbers);
    }
}

/*
 * Input : 2, 4, 6, 8, 10
 * output:
 * 2
 * 2 4
 * 2 4 6
 * 2 4 6 8
 * 2 4 6 8 10
 * 
 * 4
 * 4 6
 * 4 6 8
 * 4 6 8 10
 * 
 * 6
 * 6 8
 * 6 8 10
 * 
 * 8
 * 8 10
 * 
 * 10
 * 
 * The total subarrays are 15
 */
