package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeExample {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Mustkim";
        e.address = " Sadalga";
        e.SSN = 289568;
        e.phone = 12586936;
        try
        {
            FileOutputStream fileOut = new FileOutputStream(System.getProperty("user.dir") + "/Java/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("The serialized data is saved in employee.ser");
        }
        catch (IOException i)
        {
            i.printStackTrace();
        }
        finally
        {
            System.out.println("End of Execution..!!");
        }
    }
}
