package DataStructures.Linear.queues;

import java.util.LinkedList;
import java.util.Queue;

public class generateBinaryUsingQueue <M> {

    public static void generateBinaryNumbers(int n){
        Queue<String> s = new LinkedList<>();
        s.offer("1");
        while(n-- >0){
            String curr = s.poll();
            System.out.print(curr+ " ");
            s.offer(curr+"0");
            s.offer(curr+"1");
        }
    }
    public static void main(String[] args) {
        int n = 10;
        generateBinaryNumbers(n);
    }
}
