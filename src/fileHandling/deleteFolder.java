package fileHandling;
import java.io.File;

public class deleteFolder {
    public static void main(String[] args) {
        //relative path
        //C://Users//student//IdeaProjects//ATT//Java//DSA
        File folder = new File( "./Java/DSA");
        if(folder.delete()){
            System.out.println("Folder " + folder.getName() + " Deleted");
        }
        else {
            System.out.println("Folder " + folder.getName() + " Doesn't exists");
        }
    }
}
