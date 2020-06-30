package study;

import java.util.Stack;

/**
 * created by lanxinghua@2dfire.com on 2020/6/30
 * 反向打印链表
 */
public class StackPrintLinkedList {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        //stackType(node1);
        reverse(node1);
    }

    // 栈方式
    private static void stackType(ListNode node1){
        Stack<Integer> stack = new Stack<>();
        while (node1 != null){
            stack.push(node1.val);
            node1 = node1.next;
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    // 递归方式
    private static void reverse(ListNode node){
        if (node != null && node.next != null){
            reverse(node.next);
        }
        System.out.println(node.val);
    }
}
