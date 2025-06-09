package DataStructures.NonLinear.trees.bst;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        data = val;
        left=right=null;
    }
}
public class BinaryClassTree {

    public static void inOrder(TreeNode root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+ " ");
            inOrder(root.right);
        }
    }

    public static TreeNode insert(TreeNode root , int key){
        if(root==null){
            return new TreeNode(key);
        }

        if(key<root.data){
            root.left = insert(root.left,key);
        } else if (key>root.data) {
            root.right = insert(root.right,key);
        }
        return root;
    }


    public static TreeNode search(TreeNode root , int key){
        if (root==null || root.data==key){
            return root;
        }

        if(root.data < key){
            return search(root.right,key);
        }
        return search(root.left,key);
    }

    public static   TreeNode findMin(TreeNode root){
        TreeNode curr = root;
        while (curr!=null&& curr.left!=null){
            curr=curr.left;
        }
        return curr;
    }

    public static TreeNode deleteNode(TreeNode root , int key){
        if (root==null){
            return root;
        }
        if(key<root.data){
            root.left = deleteNode(root.left,key);
        }
        else if (key> root.data){
            root.right = deleteNode(root.right,key);
        }else
        {
            //only 1 child
            if(root.right==null){
                TreeNode temp = root.left;
                root = null;
                return temp;
            }

            if(root.left == null){
                TreeNode temp = root.right;
                root = null;
                return temp;
            }
            TreeNode temp = findMin(root.right);
            root.data = temp.data;
            root.right = deleteNode(root.right,temp.data);

        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = null;
        root=insert(root,50);
        insert(root,30);
        insert(root,20);
        insert(root,70);
        insert(root,60);
        insert(root,80);
        inOrder(root);

    }

}
