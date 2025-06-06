package DataStructures.NonLinear.trees.interviewQuestions;

class Node{
    int data;
    Node left;
    Node right;

    Node(int x){
        data = x;
        this.left = left;
        this.right = right;
    }
}
public class HeightOfBinaryTree {
    static int findHeight(Node root){
        //Base

        if(root==null){
            return 0;
        }
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(4);
        System.out.println("height of the tree: " + findHeight(root));
    }
}
