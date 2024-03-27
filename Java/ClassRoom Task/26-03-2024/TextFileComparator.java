import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFileComparator {

    public static void main(String[] args) {
        String file1Path = "file1.txt";
        String file2Path = "file2.txt";

        try {
            List<String> file1Lines = readFile("C:\\Users\\dhanu\\OneDrive\\Desktop\\New folder\\file1.txt");
            List<String> file2Lines = readFile("C:\\Users\\dhanu\\OneDrive\\Desktop\\New folder\\file2.txt");

            List<String> addedLines = new ArrayList<>();
            List<String> deletedLines = new ArrayList<>();
            List<String> modifiedLines = new ArrayList<>();

            // Find added lines
            for (String line : file2Lines) {
                if (!file1Lines.contains(line)) {
                    addedLines.add(line);
                }
            }

            // Find deleted lines
            for (String line : file1Lines) {
                if (!file2Lines.contains(line)) {
                    deletedLines.add(line);
                }
            }

            // Find modified lines
            for (String line : file1Lines) {
                if (file2Lines.contains(line) && !addedLines.contains(line)) {
                    int indexInFile1 = file1Lines.indexOf(line);
                    int indexInFile2 = file2Lines.indexOf(line);
                    if (indexInFile1 != indexInFile2) {
                        modifiedLines.add("Original: " + line + " | New: " + file2Lines.get(indexInFile2));
                    }
                }
            }

            // Display differences
            System.out.println("Added lines:");
            for (String line : addedLines) {
                System.out.println(line);
            }
            System.out.println("\n Deleted lines:");
            for (String line : deletedLines) {
                System.out.println(line);
            }
            System.out.println("\n Modified lines:");
            for (String line : modifiedLines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> readFile(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();
        return lines;
    }
}
