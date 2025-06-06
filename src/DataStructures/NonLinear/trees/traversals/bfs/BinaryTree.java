package DataStructures.NonLinear.trees.traversals.bfs;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data = data;
        this.left = this.right = null;
    }
}

public class BinaryTree {

    public static void leverOrderTrasversal(TreeNode root){
        if(root==null){
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            //left subtree
            if (temp.left!=null){
                queue.add(temp.left);
            }

            if(temp.right!=null){
                queue.add(temp.right);
            }
        }

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        System.out.println("BFS for Level order Traversal : ");
        leverOrderTrasversal(root);
    }

}
