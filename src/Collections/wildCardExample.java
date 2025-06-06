package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class wildCardExample {
    public static void printListElements(List<?> list){
        for (Object obj : list){
            System.out.print(obj+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(11);
        printListElements(integerList);

        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        printListElements(stringList);



    }
}


