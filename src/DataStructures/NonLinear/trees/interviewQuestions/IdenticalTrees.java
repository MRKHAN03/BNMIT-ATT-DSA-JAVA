package DataStructures.NonLinear.trees.interviewQuestions;

class Node1{
    int data;
    Node4 left;
    Node4 right;

    Node1(int x){
        data = x;
        left=right=null;
    }
}

public class IdenticalTrees {
    static boolean areIdentical(Node4 t1 , Node4 t2){
        if(t1==null && t2==null){
            return true;
        }
        if(t1==null || t2 ==null){
            return false;
        }

        if(t1.data!= t2.data){
            return  false;
        }

        return  (areIdentical(t1.left,t2.left) && areIdentical(t1.right, t2.right));
    }

    public static void main(String[] args) {
        Node4 t1 = new Node4(1);
        t1.left = new Node4(2);
        t1.right = new Node4(3);

        Node4 t2 = new Node4(1);
        t2.left = new Node4(2);
        t2.right = new Node4(3);

        Node4 t3 = new Node4(1);
        t3.left = new Node4(3);
        t3.right = new Node4(3);

        Node4 t4 = new Node4(1);
        t4.left = new Node4(2);
        t4.right = new Node4(3);

        System.out.println("Are t1  and t2 identical ? : "+ areIdentical(t1,t2));
        System.out.println("Are t3  and t4 identical ? : "+ areIdentical(t3,t4));

        if(areIdentical(t1,t3)){
            System.out.println("t1 and t3 are identical");
        }
        else {
            System.out.println("t1 and t3 are not identical");
        }

        if(areIdentical(t1,t4)){
            System.out.println("t1 and t4 are identical");
        }
        else {
            System.out.println("t1 and t4 are not identical");
        }
    }
}
