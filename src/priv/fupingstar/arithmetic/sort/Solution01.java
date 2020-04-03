package priv.fupingstar.arithmetic.sort;

import priv.fupingstar.arithmetic.util.ListNode;

/**
 * 单链表实现插入排序
 * @author <a href="mailto:im.fa.fa63@gmail.com">FuPingstar</a>
 * @date 2020/3/20 10:12
 */
public class Solution01 {
    public ListNode insertionSortList(ListNode head){
        ListNode root = new ListNode(0);
        ListNode p;
        ListNode q;
        ListNode r;
        p =head;
        root.next = p;

        printNode(root.next, "root");
        if (p == null && p.next == null){
            return p;
        }

        while (p != null && p.next != null){
            if (p.val <= p.next.val){
                p = p.next;
            }else {
                q = p.next;
                p.next = q.next;
                r = root;
                while (r.next.val <= q.val){
                    r = r.next;
                }
                q.next = r.next;
                r.next = q;
                printNode(root.next, "root");
            }
        }
        return root.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        node4.next = null;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        Solution01 solution01 = new Solution01();
        ListNode listNode = solution01.insertionSortList(node1);
        printNode(listNode, "result");
    }


    public static void printNode(ListNode node, String name){
        System.out.print(name + ":");
        while (node != null){
            System.out.print(node.val + "");
            node = node.next;
        }
        System.out.println();
    }
}
