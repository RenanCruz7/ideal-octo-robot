package LinkedList;

public class Leetcode876 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode middleNode(ListNode head) {
        ListNode ahead = head;

        while (ahead != null && ahead.next != null) {
            head = head.next;
            ahead = ahead.next.next;
        }
        return head;
    }
}
