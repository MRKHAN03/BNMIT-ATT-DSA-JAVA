package DataStructures.NonLinear.trees.interviewQuestions;


class Node4 {
    int data;
    Node4 left;
    Node4 right;

    Node4(int val){
        data = val;
        left=right=null;
    }
}

class SortedArrayToBST {
    public static Node4 sortedBST(int [] nums){
        return sortedarrayToBST(nums,0,nums.length-1);
    }

    private static Node4 sortedarrayToBST(int [] nums , int s , int e){
        if(s>e){
            return null;
        }

        int mid = s+(e-s)/2;
        Node4 root = new Node4(nums[mid]);
        root.left = sortedarrayToBST(nums,s,mid-1);
        root.right = sortedarrayToBST(nums,mid+1,e);
        return root;
    }


    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9};
        sortedBST(nums);
    }



}


