package Collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> a  = new ArrayList<>();
        a.add(10);
        a.add(11);
        a.add(12);
        a.add(13);
        System.out.println(a);
        System.out.println(a.indexOf(11));

        ArrayList<String > names = new ArrayList<>();
        names.add("Java");
        names.add("Python");
        names.add("C++");
        System.out.println(names);
    }
}
