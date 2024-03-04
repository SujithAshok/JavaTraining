import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 7}; 
        Arrays.sort(numbers);
        System.out.println("Sorted array in ascending order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}