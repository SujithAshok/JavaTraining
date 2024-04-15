class HollowAlphabets {
    public static void main(String[] args) {
        int size = 5; 
        char startChar = 'A';

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size * 2 - 1; j++) {
                if (j == size - 1 - i || j == size - 1 + i) {
                    System.out.print((char) (startChar + i));
                } else if (i == 0 || i == size - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
