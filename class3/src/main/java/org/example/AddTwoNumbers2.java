package org.example;


import java.util.Arrays;

public class AddTwoNumbers2 {
    static StringBuilder s= new StringBuilder();
    public static void main(String[] args) {
//        2,4,3
//        ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
//        ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));
        ListNode l1 = new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9)))))));
        ListNode l2 = new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))));
//        getNode(l1);
//        System.out.println(getNodeString(l1));
//        int result = Integer.parseInt(getNodeString(l1))+Integer.parseInt(getNodeString(l2));
//        System.out.println(result);
//        System.out.println(String.valueOf(result).length());
//        StringBuilder s = new StringBuilder(String.valueOf(result));
//        s.reverse();
        ListNode ans = addTwoNumbers(l1, l2);

    }

    public static String getNodeString(ListNode selectedNode) {
        if(selectedNode.next==null)
             return String.valueOf(selectedNode.val) ;
        else {

            return getNodeString(selectedNode.next)+String.valueOf( selectedNode.val);
        }
    }

//    public static ListNode getListNode(int inValue ){
//        if
//    }
public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode vRetListNode = new ListNode(Integer.MIN_VALUE);
    ListNode currentNode = vRetListNode;
    int carry = 0;

    while (l1 != null || l2 != null || carry > 0) {
        if (l1 != null) {
            carry += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            carry += l2.val;
            l2 = l2.next;
        }
        currentNode.next = new ListNode(carry % 10);
        carry /= 10;
        currentNode = currentNode.next;

    }

    return vRetListNode.next;
}
}
