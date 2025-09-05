import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SecretWriter {
        
        public static void createHiddenFile(){
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(".hiddenfile.txt"))) {
            bufferedWriter.write("password");
        } catch (IOException e) {
            e.printStackTrace();
        
        }
        }
        
        public static void regularFile(){
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(".secretfolder/passwordfile.txt"))) {
            bufferedWriter.write("passwordisunique");
        } catch (IOException e) {
            e.printStackTrace();
         }
        }
        public static void main(String[] args) {
            createHiddenFile();
            regularFile();
        }
        
    }

    

