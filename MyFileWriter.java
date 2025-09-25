
import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MyFileWriter {
    public static void main(String[] args) {
        System.out.println(hashfile("Cooper"));
        // String data = "Hello, World!";
        // String fileName1 = "example.txt";
        // String fileName2 = "example2.txt";
        // String fileName3 = "example3.txt";
        // String fileName4 = "example4.txt";
        // String fileName5 = "example5.txt";

        // // 1. Using FileWriter
        // try (FileWriter writer = new FileWriter(fileName1)) {
        //     writer.write(data);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // // 2. Using BufferedWriter
        // try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2))) {
        //     bufferedWriter.write(data);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // // 3. Using FileOutputStream
        // try (FileOutputStream outputStream = new FileOutputStream(fileName3)) {
        //     outputStream.write(data.getBytes());
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // // 4. Using BufferedOutputStream
        // try (BufferedOutputStream bufferedOutputStream =
        //         new BufferedOutputStream(new FileOutputStream(fileName4))) {
        //     bufferedOutputStream.write(data.getBytes());
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

<<<<<<< HEAD
        // // 5. Using Files (java.nio.file)
        // try {
        //     Files.write(Paths.get(fileName5), data.getBytes(StandardCharsets.UTF_8));
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
=======
        // 5. Using Files (java.nio.file)
        try {
            Files.write(Paths.get(fileName5), data.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }

        testPrintFileSize();
>>>>>>> origin/main
    }

    private static void printFileSize(String... fileNames) {
        long totalSize = 0;
        for (String fileName : fileNames) {
            File file = new File(fileName);
            if (file.exists()) {
                totalSize += file.length();
            }
        }
        System.out.println("Total size of all files: " + totalSize + " bytes");
    }
    
    private static void testPrintFileSize() {
        File file1 = new File("file1.txt");
        try {
            Files.write(Paths.get("file1.txt"), "fortnitebattlepass".getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            // TODO: handle exception
        }
        printFileSize("file1.txt", ".hiddenfile.txt", ".secretfolder/passwordfile.txt");
    }

    /**
     * Reads a text file and returns its contents as a string.
     * 
     * @param filePath the path to the file
     * @return the contents of the file as a string
     * @throws IOException if an I/O error occurs
     */
    public static String stringify(String filePath) throws IOException {
<<<<<<< HEAD
=======

>>>>>>> origin/main
        String string = Files.readString(Paths.get(filePath));
        return string;
    }

    public static String hashfile(String path) {
        byte[] hash = new byte[0];
        try {
            hash = getSHA(path);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();

        }
        return toHexString(hash);
    }

    public static byte[] getSHA(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        return md.digest(input.getBytes(StandardCharsets.UTF_8));
    }

    public static String toHexString(byte[] hash) {
        BigInteger number = new BigInteger(1, hash);


        StringBuilder hexString = new StringBuilder(number.toString(16));

        while (hexString.length() < 64) {
            hexString.insert(0, '0');
        }

        return hexString.toString();
    }



}

