package fileHandling;
import java.io.File;
import java.io.IOException;

public class deleteFIle {
    public static void main(String[] args){
        File file = new File("./Java/DSA/bnmit.txt");
        if(file.delete()){
            System.out.println("File "+file.getName()+" Deleted.");
        }
        else {
            System.out.println("File Doesn't exists");
        }

    }
}

