package DataStructures.Linear.Stack;

import java.util.Stack;

class ListNode{
    int data;
    ListNode next;

    ListNode(int val) {
        data = val;
        next = null;
    }
}

public class palindromeLinkedList {
    public static boolean isPalindrome(ListNode head){
        Stack <Integer> s = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            s.push(temp.data);
            temp=temp.next;
        }
        temp = head;
        while (temp!=null){
            if(s.pop()!=temp.data){
                return false;
            }
            temp=temp.next;
        }
        return  true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        System.out.println(isPalindrome(head) ? "Palindrome" : "Not Palindrome");
    }
}
