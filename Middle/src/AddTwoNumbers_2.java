/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class AddTwoNumbers_2 {
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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode s = res;
        int flag = 0;
        while (l1 != null || l2 != null || flag!=0) {
            ListNode p = new ListNode();
            p.val = (l1 == null ? 0 : l1.val) +
                    (l2 == null ? 0 : l2.val) +
                    flag;
            if (p.val >= 10) {
                p.val = p.val - 10;
                flag = 1;
            } else flag = 0;
            s.next = p;
            s = s.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        /*if (flag != 0) {
            ListNode p = new ListNode();
            p.val = flag;
            s.next = p;
        }*/
        return res.next;
    }

    public static void main(String[] args) {
        ListNode l1 =
                new ListNode(2,
                        new ListNode(4,
                                new ListNode(3)));
        ListNode l2 =
                new ListNode(5,
                        new ListNode(6,
                                new ListNode(6)));
        System.out.println(addTwoNumbers(l1, l2));
    }
}
