package fileHandling;

import java.io.File;
public class createFolder {
    public static void main(String[] args) {

        // using absolute path

        File folder = new File( "C://Users//student//IdeaProjects//ATT//Java//DSA");
        if(folder.mkdir()){
            System.out.println("Folder " + folder.getName() + " created");
        }
        else {
            System.out.println("Folder " + folder.getName() + " Already exists");
        }
    }
}
