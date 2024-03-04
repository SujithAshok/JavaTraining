import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; 
        int indexToRemove = 2;
        numbers = removeElement(numbers, indexToRemove);
        System.out.println("Array after removing element at index " + indexToRemove + ": " + Arrays.toString(numbers));
    }

    public static int[] removeElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            return arr;
        }

        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return Arrays.copyOf(arr, arr.length - 1);
    }
}
