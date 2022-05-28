/**
 * 给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
 */
public class DeleteDuplicates_83 {
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
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode p = head;
        while (p.next != null) {
            if (p.next.val == p.val) p.next = p.next.next;
            else p = p.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] l1 = {1, 1, 2, 2};
        ListNode list1 = new ListNode();
        ListNode p1 = list1;
        for (int value : l1) {
            ListNode s = new ListNode();
            s.val = value;
            s.next = null;
            list1.next = s;
            list1 = list1.next;
        }
        ListNode p = deleteDuplicates(p1.next);
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }
}


