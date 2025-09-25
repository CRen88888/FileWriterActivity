import java.io.*;

public class HashFileTests {

    // The test result was a success as the expected and actual results were identical. I tested the
    // hash of an empty file and it matched the hash of the SHA256 of an empty file.
    public static String testHashFileEmptyFiles() throws IOException {

        String expected = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";

        return "Expected: " + expected + "\n Actual: " + MyFileWriter.hashfile("empty.txt");
    }

    // The test result was a success as the expected and actual results were identical. I tested the
    // hash of a Harry Potter book file and it matched the hash of the SHA256 of the same book file.
    public static void testHashFileLargeFiles() throws IOException {
        System.out.println(
                "Expected: ef9a0aced1738590fed12d3bb0bf702773085589a5c42f978553339cd12ea04d \nActual: "
                        + MyFileWriter.hashfile("largefile.txt"));
    }

    // The test result was a success as the expected and actual results were identical. I tested the
    // hash of a file with emojis and it matched the hash of the SHA256 with the same emojis.
    public static void testHashFileSpecialChars() throws IOException {
        System.out.println(
                "Expected: df5819fd4de063ceefe9ceaa6614aa87bc56854d3b6fd7908f1174b772acbc14 \nActual: "
                        + MyFileWriter.hashfile("emojis.txt"));

    }

    // The test result was a success as the expected and actual results were identical. I tested the
    // hash of a nonexistent file and it threw a FileNotFound exception, which is what was expected.
    public static void testHashFileNonExistent() throws IOException {
        MyFileWriter.hashfile("doesnotexist.txt");
    }

    public static void main(String[] args) throws IOException {
        System.out.println(testHashFileEmptyFiles());
        testHashFileLargeFiles();
        testHashFileSpecialChars();
        try {
            testHashFileNonExistent();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
