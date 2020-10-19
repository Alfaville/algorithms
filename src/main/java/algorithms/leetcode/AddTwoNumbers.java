package algorithms.leetcode;

import java.math.BigInteger;

/**
 * https://leetcode.com/problems/add-two-numbers/
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class AddTwoNumbers {

    public ListNode solution(ListNode l1, ListNode l2) {
        ListNode listNode1 = reverseListNode(l1);
        ListNode listNode2 = reverseListNode(l2);

        BigInteger sumTotalListNode = new BigInteger(sumListNodes(listNode1)).add(new BigInteger(sumListNodes(listNode2)));

        ListNode outputListNode = null;
        ListNode outputListNodePrev = null;
        String[] node = sumTotalListNode.toString().split("");
        for (int i = 0; i < node.length; i++) {
            int item = Integer.parseInt(node[i]);
            outputListNodePrev = outputListNode;
            outputListNode = new ListNode(item, outputListNodePrev);
        }

        System.out.println(outputListNode);
        return outputListNode;
    }

    private ListNode reverseListNode(ListNode ln) {
        ListNode prev = null;
        ListNode current = ln;
        ListNode next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        ln = prev;
        return ln;
    }

    private String sumListNodes(ListNode ln) {
        String number = String.valueOf(ln.val);
        boolean hasNext = (ln.next != null);
        if (hasNext)
            number += sumListNodes(ln.next);

        return number;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

}
