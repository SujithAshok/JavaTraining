import java.util.Scanner;

public class UserInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[1];
        int[] ages = new int[1];
        boolean[] isMarriedArray = new boolean[1];
        int currentIndex = 0;

        while (true) {
            System.out.println("Enter name (type 'exit' to quit): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            // Resize arrays if necessary
            if (currentIndex >= names.length) {
                names = resizeArray(names);
                ages = resizeArray(ages);
                isMarriedArray = resizeArray(isMarriedArray);
            }

            System.out.println("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.println("Are you married? (true/false): ");
            boolean isMarried = Boolean.parseBoolean(scanner.nextLine());

            // Store the inputs
            names[currentIndex] = name;
            ages[currentIndex] = age;
            isMarriedArray[currentIndex] = isMarried;

            currentIndex++;
        }

        // Display entered details
        System.out.println("Entered details:");
        for (int i = 0; i < currentIndex; i++) {
            System.out.println("Name: " + names[i] + ", Age: " + ages[i] + ", Marital Status: " + isMarriedArray[i]);
        }
    }

    // Method to resize arrays
    private static String[] resizeArray(String[] array) {
        String[] newArray = new String[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    private static int[] resizeArray(int[] array) {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    private static boolean[] resizeArray(boolean[] array) {
        boolean[] newArray = new boolean[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
}
