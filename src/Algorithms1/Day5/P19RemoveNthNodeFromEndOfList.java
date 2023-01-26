package Algorithms1.Day5;

public class P19RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {

    }

    /*
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode slow = dummyHead;
        ListNode fast = dummyHead;

        for(int i = 1; i <= n+1; i++) {
            fast = fast.next;
        }

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummyHead.next;
    }
     */
}
