import java.util.Stack;

/**
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 */
public class IsPalindrome_234 {
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
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        boolean odd = fast != null;
        ListNode firstHalfEnd = slow;
        ListNode secondHalfStart = odd ? slow.next : slow;
        ListNode node1 = reverseFirstHalf(head, firstHalfEnd);
        ListNode node2 = secondHalfStart;
        while (node1 != null) {
            if (node1.val != node2.val) {
                return false;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        return true;
    }

    static ListNode reverseFirstHalf(ListNode head, ListNode firstHalfEnd) {
        ListNode prev = null, curr = head;
        while (curr != firstHalfEnd) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5,
                                                new ListNode(6,
                                                        new ListNode(1, null)))))));
        System.out.println(isPalindrome(head));
    }
}
