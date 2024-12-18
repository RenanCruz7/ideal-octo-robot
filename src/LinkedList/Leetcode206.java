package LinkedList;

public class Leetcode206 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        ListNode new_list = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = new_list;
            new_list = head;
            head = next;
        }

        return new_list;
    }


}
