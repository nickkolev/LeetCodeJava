package TopInterviewQuestions;

public class P206ReverseLinkedList {

    public static void main(String[] args) {

    }

    /*
    public static ListNode reverseList(ListNode head) {

        //base case
        if(head == null) return null;

        //define curr and prev
        ListNode curr = head;
        ListNode pre = null;

        //while curr is not null, we continue to traverse the list
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }

        //return pre
        return pre;
    }
     */
}
