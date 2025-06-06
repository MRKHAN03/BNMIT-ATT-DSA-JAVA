package DataStructures.Linear.Stack;

import java.util.Spliterator;

public class genericStack<M> { //generics (works with any datatype)

    private static final int MAX_Size = 5;
    private Object[] arr = new Object[MAX_Size];
    private int top = -1;


    public void push(M data){
        if (top==MAX_Size-1){
            System.out.println("Stack overflow!! Cannot" + data);
            return;
        }
        arr[++top] =data;
        System.out.println("Pushed: "+data);
    }
    @SuppressWarnings("unchecked")
    public M pop(){
        if(top ==-1){
            System.out.println("Stack underflow!");
            return null;
        }
        M poped = (M) arr[top--];
        System.out.println("Popped:"+ poped);
        return  poped;
    }
    public M peek(){
        if(top ==-1){
            System.out.println("Stack underflow!");
            return null;
        }
        return (M) arr[top];
    }

    public void printStack(){
        if(top ==-1){
            System.out.println("Stack Empty!");
            return;
        }
        System.out.print("Stack elements: " );
        for (int i = 0;i<=top;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public Boolean isEmpty(){
        return top==-1;
    }

    public Boolean isFUll(){
        return top==MAX_Size-1;
    }

    public int size(){
        return top+1;
    }


    public static void main(String[] args) {
        genericStack<Integer> intStack = new genericStack<>();
        intStack.push(5);
        intStack.push(6);
        intStack.push(7);
        intStack.printStack();
        genericStack<String> stringStack = new genericStack<>();
        stringStack.push("Apple");
        stringStack.push("Banana");
        stringStack.push("Orange");
        stringStack.printStack();
    }
}
