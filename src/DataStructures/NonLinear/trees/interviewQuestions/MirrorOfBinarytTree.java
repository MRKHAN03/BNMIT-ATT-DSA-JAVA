package DataStructures.NonLinear.trees.interviewQuestions;

public class MirrorOfBinarytTree {

    int data;
    MirrorOfBinarytTree left;
    MirrorOfBinarytTree right;
    MirrorOfBinarytTree(int data){
        this.data = data;
        this.left = this.right = null;
    }

    private static void inOrder(MirrorOfBinarytTree root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+ " ");
            inOrder(root.right);
        }
    }

    private static MirrorOfBinarytTree  mirrorTree(MirrorOfBinarytTree root){
        if(root==null){
            return root;
        }
        //swap
        MirrorOfBinarytTree temp = root.left;
        root.left= root.right;
        root.right = temp;
        //recursively swap all nodes
        if(root.left!=null){
            mirrorTree(root.left);
        }
        if(root.right!=null){
            mirrorTree(root.right);
        }
        return root;
    }

    public static void main(String[] args) {
        MirrorOfBinarytTree root = new MirrorOfBinarytTree(1);
        root.left =new MirrorOfBinarytTree(2);
        root.right = new MirrorOfBinarytTree(3);
        root.left.left = new MirrorOfBinarytTree(4);
        root.left.right = new MirrorOfBinarytTree(5);
        root.right.left = new MirrorOfBinarytTree(6);
        root.right.right = new MirrorOfBinarytTree(7);
        System.out.println("Inorder of Original Tree");
        inOrder(root);
        System.out.println();
        root = mirrorTree(root);
        System.out.println("Inorder of Mirror Tree");
        inOrder(root);
        System.out.println();
    }
}
