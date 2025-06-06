package Collections;

public class BuilderExample {
    public void stringAppend(){
        StringBuilder buffer = new StringBuilder("C");
        System.out.println("Original String:" + buffer);
        buffer.append("++");
        System.out.println("New String:" + buffer);
    }

    public  void stringReverse(){
        StringBuilder buffer = new StringBuilder("MIKTSUM");
        System.out.println("Original String:" + buffer);
        buffer.reverse();
        System.out.println("New String:" + buffer);

    }

    public  void stringInsert(){
        StringBuilder buffer = new StringBuilder("Pyon");
        System.out.println("Original String:" + buffer);
        buffer.insert(1,"th");
        System.out.println("New String:" + buffer);

    }

    public static void main(String[] args) {
        new BuilderExample().stringAppend();
        new BuilderExample().stringInsert();
        new BuilderExample().stringReverse();
    }
}
