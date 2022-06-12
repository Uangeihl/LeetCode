/**
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 */


public class RemoveElements_203 {
    static class ListNode {
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

    public static ListNode removeElements(ListNode head, int val) {
        //快慢指针
        while (head != null && head.val == val) head = head.next;
        ListNode fast = head, slow = head;
        while (fast != null) {
            if (fast.val == val) slow.next = fast.next;
            else slow = fast;
            fast = slow.next;
        }
        return head;
        //递归
        /*if (head == null) return head;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;*/
    }

    public static void main(String[] args) {
        ListNode head =
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(2,
                                        new ListNode(1,
                                                new ListNode(4,
                                                        new ListNode(5,
                                                                new ListNode(6)))))));
        System.out.println(removeElements(head, 6));
    }
}
