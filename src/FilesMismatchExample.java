import java.io.IOException;
import java.nio.file.*;

public class FilesMismatchExample {
    public static void main(String[] args) throws IOException {
        Path file1 = Path.of("file1.txt");
        Path file2 = Path.of("file2.txt");

        // Compare files and get the position of the first mismatch
        long mismatch = Files.mismatch(file1, file2);
        if (mismatch == -1) {
            System.out.println("Files are identical");
        } else {
            System.out.println("Files mismatch at byte position: " + mismatch);
        }
    }
}
