public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6};
		System.out.print("The original array is: " );		
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] +" ");
		}
		System.out.println("\n");
        int n = array.length + 1; 

        int missingNumber = findMissingNumber(array, n);
        System.out.println("The missing number is: " + missingNumber);
    }
	
    public static int findMissingNumber(int[] arr, int n) {
        int total = n * (n + 1) / 2;

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return total - sum;
    }
}
