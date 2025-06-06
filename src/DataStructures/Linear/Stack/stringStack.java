package DataStructures.Linear.Stack;

public class stringStack {
    private static final int MAX_Size = 5;
    private String[] arr = new String[MAX_Size];
    private int top = -1;

    public void push(String data){
        if (top==MAX_Size-1){
            System.out.println("Stack overflow!! Cannot" + data);
            return;
        }
        arr[++top] = data;
        System.out.println("Pushed: "+data);
    }

    public String pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return null;
        }

        String popped = arr[top--];
        System.out.println("Popped: "+ popped);
        return popped;
    }

    public String peek(){
        if(top==-1){
            System.out.println("Stack Underflow.No top element");
            return null;
        }
        System.out.println("Top Element:"+arr[top]);
        return arr[top];
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

    public void printStack(){
        if(isEmpty()){
            System.out.println("Stack Empty");
        }

        for(int i = 0;i<=top;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        stringStack stack = new stringStack();
        stack.push("apple");
        stack.push("mango");
        stack.push("orange");
        stack.peek();
        stack.printStack();
        stack.pop();
        stack.printStack();

    }


}
