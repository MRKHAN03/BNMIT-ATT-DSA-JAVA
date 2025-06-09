package DataStructures.NonLinear.trees.interviewQuestions;


class TreeNode1 {
      int val;
     TreeNode1 left;
     TreeNode1 right;
     TreeNode1(int x)
     {
         val = x;
     }
 }
public class Codec{
    public String serialize(TreeNode1 root){
        StringBuilder sb = new StringBuilder();
        serializeHelper(root,sb);
        return sb.toString();
    }

    public void serializeHelper(TreeNode1 node , StringBuilder sb){
        if(node == null){
            sb.append("null,");
            return;
        }
        sb.append(node.val).append(",");
        serializeHelper(node.left,sb);
        serializeHelper(node.right,sb);
    }

    public TreeNode1 deserialize(String data) {
        String []  values = data.split(" ");
        int [] index = {0};
        return deserializehelper(values,index);
    }

    public TreeNode1 deserializehelper(String [] values , int[] index){
        if(index[0]>=values.length || values[index[0]].equals("null")){
            index[0]++;
            return null;
        }

        TreeNode1 node = new TreeNode1(Integer.parseInt(values[index[0]]));
        index[0]++;
        node.left = deserializehelper(values, index);
        node.right = deserializehelper(values, index);
        return node;
    }
}
