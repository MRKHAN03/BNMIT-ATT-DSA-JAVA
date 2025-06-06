package DataStructures.Linear.queues;

public class queue {
    private static final int max=10;
    private int [] arr = new int[max];
    private int front;
    private int rear;

    public queue(){
        front=rear=-1;
    }

    public boolean isEmpty(){
        return (front==-1 && rear ==-1);
    }
    public boolean isFull(){
        return (rear== max-1);
    }

    public int size(){
        return rear+1;
    }

    public void enqueue(int element){
        if(isFull()){
            System.out.println("Queue is full.Cant enqueue !! ");
            return;
        }
        else if (isEmpty()){
            front=rear=0;
        }
        else{
            rear++;
        }
        arr[rear]=element;
        System.out.println("The element enqueued is :"+element);
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty. Cant remove any element");
        } else if (front==rear) {
            front=rear= -1;
        }
        else{
            front++;
        }
    }

    public int getFront(){
        if(isEmpty()){
            System.out.println("Queue is empty cant return front");
            return -1;
        }
        else {
            return arr[front];
        }
    }
    public int getRear(){
        if(isEmpty()){
            System.out.println("Queue is empty cant return rear");
            return -1;
        }
        else {
            return arr[rear];
        }
    }


    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        for(int i = front;i<rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        queue q = new queue();
        int [] arr = {10,20,30,40,50};
        for(int i : arr){
            q.enqueue(i);
        }
        q.printQueue();
    }


}
