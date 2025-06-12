package Algorithms.GreedyAlgo;
import java.io.StringReader;
import java.util.*;

class Node{
    int data;
    Node right;
    Node left;

    Node(int d){
        data = d;
        left = null;
        right=null;
    }
}
class Comp implements Comparator<Node> {
    public int compare(Node a , Node b){
        return a.data-b.data;

    }
}


public class HuffmanCoding {

    private void traverse(Node root , List<String> ans , String temp){
        //base case
        if(root.left==null && root.right==null){
            ans.add(temp);
            return;
        }

        if(root.left!=null){
            traverse(root.left , ans , temp + "0");
        }

        if(root.right!=null){
            traverse(root.right , ans , temp + "1");
        }
    }


    public List<String> huffmanCodes(List<Integer> f , int N){
        PriorityQueue<Node> pq = new PriorityQueue<>(new Comp());

        for (int i = 0;i<N;i++){
            pq.add(new Node(f.get(i)));
        }

        while ((pq.size()>1)){
            Node left = pq.poll();
            Node right = pq.poll();
            Node newNode = new Node(left.data + right.data);
            newNode.left = left;
            newNode.right =right;
            pq.add(newNode);
        }
        Node root = pq.peek();

        List<String> ans = new ArrayList<>();
        traverse(root,ans,"");
        return ans;
    }

    public static void main(String[] args) {
        HuffmanCoding hf  = new HuffmanCoding();
        //String s = "fedcba";
        List<Integer> freq = Arrays.asList(5,9,12,13,16,45);
        int N = freq.size();
        List<String> huffmanCodes = hf.huffmanCodes(freq,N);
        System.out.println("Huffman Codes : " + huffmanCodes);
    }
}
