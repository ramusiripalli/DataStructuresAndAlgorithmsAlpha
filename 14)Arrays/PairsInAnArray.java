//print pairs 

// output (2,4)(2,6)(2,8)(2,10)
// (4,6)(4,8)(4,10)
// (6,8)(6,10)
// (8,10)

//Total number of pairs = n*(n-1)/2

public class Main {

    public static void pairsInAnArray(int[] numbers) {
        int n = numbers.length;
        int totalNumberofPairs = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")");
                totalNumberofPairs++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs = " + totalNumberofPairs);

    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10 };
        pairsInAnArray(numbers);
    }
}
