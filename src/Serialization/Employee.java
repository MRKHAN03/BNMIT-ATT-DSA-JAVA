package Serialization;

import java.io.Serializable;
import java.security.PublicKey;

public class Employee implements Serializable {
    public String name;
    public String address;
    public transient int SSN; //the "transient" is used to hide the data to get serialized
    public int phone;
}
