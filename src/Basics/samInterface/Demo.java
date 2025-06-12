package Basics.samInterface;

import java.util.Deque;

public interface Demo {
    void function();
}

class BNMIT{
    public static void main(String[] args) {
        Demo obj = new Demo() {
            public void function() {
                System.out.println("Boiler plate");
            }
        };

        //Scala ->JAVA

        obj.function();
        Demo obj1 = ()-> System.out.println("Lambda Expression - Scala Inspired");
        obj1.function();
    }
}
