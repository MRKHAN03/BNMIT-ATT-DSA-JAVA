package fileHandling;
import java.io.File;
import java.io.IOException;

public class createFIle {
    public static void main(String[] args) throws IOException {
        File file = new File("./Java/DSA/bnmit.txt");
        if(file.createNewFile()){
            System.out.println("File "+file.getName()+" Created.");
        }
        else {
            if(file.exists()){
                System.out.println("File Already exists");
            }
            else {
                System.out.println("Failed to create the file.");
            }

        }
    }
}
