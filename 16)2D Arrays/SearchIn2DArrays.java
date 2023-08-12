
//creation of 2D Arrays and search an element in 2D arrays
import java.util.*;

public class Main {

    // search if the key is there in matrix or not

    public static boolean searchKey(int[][] matrix, int key) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == key) {
                    System.out.print("The key  5 found at  row and column are as folows (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {

        int matrix[][] = new int[3][3];
        int rows = matrix.length;
        int columns = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // output of the matrix
        System.out.println("The matrix is as Follows: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        searchKey(matrix, 5);
    }
}
