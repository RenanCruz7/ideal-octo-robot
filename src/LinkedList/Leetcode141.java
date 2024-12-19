package LinkedList;

public class Leetcode141 {

    class ListNode {
        int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
     }
  }
    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode ahead = head;

            while (ahead != null && ahead.next != null) {
                head = head.next;
                ahead = ahead.next.next;
                if (head == ahead) {
                    return true;
                }
            }
            return false;
        }
    }
}
