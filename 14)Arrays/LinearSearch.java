public class Main {
    public static int linearSearch(int[] nums, int target) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 7;
        int index = linearSearch(array, target);
        if (index == -1) {
            System.out.println("Key is not Found");
        } else {
            System.out.println("Key is at index " + index);
        }
    }
}
