package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorExample {
    public static void main(String[] args) {
        ArrayList<String > names = new ArrayList<>();
        names.add("Java");
        names.add("Python");
        names.add("C++");

        Iterator<String> it = names.iterator() ;
        while (it.hasNext()){
            System.out.print(it.next()+ " ");
        }

        }

}
