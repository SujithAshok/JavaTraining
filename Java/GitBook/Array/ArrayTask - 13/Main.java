public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int mergedLength = arr1.length + arr2.length;
        int[] mergedArray = new int[mergedLength];
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[arr1.length + i] = arr2[i];
        }
        System.out.print("Merged Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}
