public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10}; 
        boolean found = false;

        for (int number : numbers) {
            if (number == 6) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found, The number 6 is in the Array");
        } else {
            System.out.println("Not found");
        }
    }
}
