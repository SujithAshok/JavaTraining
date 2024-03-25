import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileComparitor {
    public static void main(String[] args) {
        compareFiles("file1.txt", "file2.txt");
    }

    public static void compareFiles(String filePath1, String filePath2) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\dhanu\\OneDrive\\Desktop\\Java\\ClassRoom Task\\25-03-2024\\file1.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader("C:\\Users\\dhanu\\OneDrive\\Desktop\\Java\\ClassRoom Task\\25-03-2024\\file2.txt"));

            String line1 = reader1.readLine();
            String line2 = reader2.readLine();
            int lineNum = 1;

            while (line1 != null || line2 != null) {
                if ((line1 == null && line2 != null) || (line1 != null && line2 == null)) {
                    System.out.println("Files have different number of lines.");
                    break;
                }

                if (!line1.equals(line2)) {
                    System.out.println("Difference found at line " + lineNum + ":");
                    System.out.println("File 1: " + line1);
                    System.out.println("File 2: " + line2);
                    System.out.println();
                }

                line1 = reader1.readLine();
                line2 = reader2.readLine();
                lineNum++;
            }

            reader1.close();
            reader2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
