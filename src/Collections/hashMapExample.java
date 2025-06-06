package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class hashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> hm1 = new HashMap<>();  // HASH MAPs does not maintain insertion order
        hm1.put(1,"Mustkim");
        hm1.put(4,"Imran");
        hm1.put(3,"Anzar");
        hm1.put(2,"Azlan");
        hm1.put(6,"Rehan");
        hm1.put(5,"Iffi");
        System.out.println("Iterating over Hash MAP");

        for(Map.Entry<Integer , String > entry : hm1.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }



        Map<Integer,String> hm2 = new LinkedHashMap<>();  // to maintain insertion order we use LINKED HASH MAPs
        hm2.put(1,"Mustkim");
        hm2.put(4,"Imran");
        hm2.put(3,"Anzar");
        hm2.put(2,"Azlan");
        hm2.put(6,"Rehan");
        hm2.put(5,"Iffi");
        System.out.println("Iterating over Linked hash MAP");

        for(Map.Entry<Integer , String > entry : hm2.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
