public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 3, 7, 3, 8, 3}; 
        int targetValue = 3;

        int count = countOccurrences(numbers, targetValue);

        System.out.println("Number of occurrences of " + targetValue + ": " + count);
    }
    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int number : arr) {
            if (number == target) {
                count++;
            }
        }
        return count;
    }
}
