package Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class hashTables {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht1 = new Hashtable<>();  // HASH MAPs does not maintain insertion order
        ht1.put(106, "Mustkim");
        ht1.put(99, "Imran");
        ht1.put(21, "Anzar");
        ht1.put(12, "Azlan");
        ht1.put(55, "Rehan");
        ht1.put(88, "Iffi");
        System.out.println(ht1);

        for (Map.Entry<Integer,String > entry : ht1.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
