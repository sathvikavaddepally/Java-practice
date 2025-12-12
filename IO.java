
    import java.io.*;
public class IO {

    public static void main(String[] args) {
        try (FileReader fr = new FileReader("nonexistent.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
            // Output: nonexistent.txt (No such file or directory)
        }
    }
}

    
