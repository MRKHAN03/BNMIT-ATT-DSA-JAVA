package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class dequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(100);
        deque.addLast(200);
        deque.addLast(300);
        System.out.println(deque);
        int x = deque.removeLast();
        System.out.println(deque);
    }
}
