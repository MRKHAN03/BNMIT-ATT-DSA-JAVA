package Collections;

public class BufferExample {
    public void stringAppend(){
        StringBuffer buffer = new StringBuffer("C");
        System.out.println("Original String:" + buffer);
        buffer.append("++");
        System.out.println("New String:" + buffer);
    }

    public  void stringReverse(){
        StringBuffer buffer = new StringBuffer("MIKTSUM");
        System.out.println("Original String:" + buffer);
        buffer.reverse();
        System.out.println("New String:" + buffer);

    }

    public  void stringInsert(){
        StringBuffer buffer = new StringBuffer("Pyon");
        System.out.println("Original String:" + buffer);
        buffer.insert(1,"th");
        System.out.println("New String:" + buffer);

    }

    public static void main(String[] args) {
        new BufferExample().stringAppend();
        new BufferExample().stringInsert();
        new BufferExample().stringReverse();
    }
}
