package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class hashSetExample {
    public static void main(String[] args) {
        HashSet<String > names = new LinkedHashSet<>();
        names.add("Java");
        names.add("Python");
        names.add("C++");
        names.add("C++");
        names.add("C++");

        HashSet<Integer> numbers= new LinkedHashSet<>();
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(12);
        numbers.add(12);
        numbers.add(13);
        numbers.add(11);

        System.out.println(names);
        System.out.println(numbers);
        System.out.println(names.contains("Rahul"));


    }
}
