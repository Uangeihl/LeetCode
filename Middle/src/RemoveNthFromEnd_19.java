/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
public class RemoveNthFromEnd_19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode p = head;
        int count = -1;
        while (p != null) {
            count++;
            p = p.next;
        }
        if (count == n - 1) head = head.next;
        p = head;
        while (p != null) {
            if (count == n) {
                p.next = p.next.next;
                break;
            }
            count--;
            p = p.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2/*,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))*/));
        ListNode p = removeNthFromEnd(head, 1);
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }
}
