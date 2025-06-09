package DataStructures.NonLinear.trees.interviewQuestions;

class Node2{
    int data;
    Node2 left;
    Node2 right;

    Node2(int x){
        data = x;
        left=right=null;
    }
}

public class LeftRightView {

    public static void lv(Node2 root){
        if(root ==null){
            return;
        }
        while(root!=null){
            System.out.print(root.data + " ");
            root=root.left;
        }
    }

    public static void rv(Node2 root){
        if(root ==null){
            return;
        }
        while(root!=null){
            System.out.print(root.data + " ");;
            root=root.right;
        }
    }

    public static void main(String[] args) {
        Node2 root = new Node2(1);
        root.left = new Node2(2);
        root.left.right = new Node2(9);
        root.right = new Node2(3);
        root.left.left = new Node2(4);
        root.left.left.left = new Node2(7);
        root.right.right = new Node2(5);
        root.right.right.right = new Node2(8);
        System.out.print("Left View: ");
        lv(root);
        System.out.println();
        System.out.print("Right View: ");
        rv(root);

    }
}
