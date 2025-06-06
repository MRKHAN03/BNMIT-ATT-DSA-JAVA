package DataStructures.Linear.Stack;

import java.util.Stack;

public class stackExample {
    public static void main(String[] args) {
        Stack <String>s = new Stack<>();
        s.push("Apple");
        s.push("Mango");
        s.push("Banana");
        System.out.println("Stack:" + s);
        System.out.println("Popped:"+ s.pop());
        System.out.println("Size:"+ s.size());
    }
}
