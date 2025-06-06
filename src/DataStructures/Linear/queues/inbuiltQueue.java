package DataStructures.Linear.queues;

import java.util.LinkedList;
import java.util.Queue;

public class inbuiltQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(13);
        queue.offer(15);
        queue.offer(17);
        System.out.println("Queue: "+queue);
        queue.poll();
        System.out.println("Queue: "+queue);
        System.out.println("Front element:" + queue.peek());
        System.out.println("SIze of queue: " + queue.size());

    }
}
