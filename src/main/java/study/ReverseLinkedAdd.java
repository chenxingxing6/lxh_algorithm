package study;

/**
 * created by lanxinghua@2dfire.com on 2020/6/28
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class ReverseLinkedAdd {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(4);
        node4.next = node5;
        node5.next = node6;

        ListNode add = add(node1, node4);
        while (add != null){
            System.out.println(add.val);
            if (add.next == null){
                break;
            }
            add = add.next;
        }

    }

    /**
     * 1.同步遍历两个逆序后链表，相加生成新链表，同时关注进位
     * 2.当两个链表都遍历完成后，关注进位。
     * 3.将两个逆序的链表再逆序一遍，调整回去
     */
    public static ListNode add(ListNode node1, ListNode node2){
        ListNode node = new ListNode(0);
        int sum = 0;
        ListNode cur = node;
        while (node1 != null || node2 != null || sum !=0){
            if (node1 != null){
                sum+=node1.val;
                node1 = node1.next;
            }
            if (node2!= null){
                sum+=node2.val;
                node2 = node2.next;
            }
            cur.next = new ListNode(sum%10);
            sum = sum / 10;
            cur = cur.next;
        }
        return node.next;
    }


    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
}
