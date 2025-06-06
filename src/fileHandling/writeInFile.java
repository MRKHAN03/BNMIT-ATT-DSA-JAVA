package fileHandling;
import java.io.FileWriter;
import java.io.IOException;

public class writeInFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("./Java/DSA/bnmit.txt",true);
        writer.append("\nWe will write into File now");
        writer.close();
        System.out.println("Successfully added data into file");
    }
}
