/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class MergeTwoLists_21 {
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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode();
        ListNode p = list3;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                list3.next = list1;
                list1 = list1.next;
            } else {
                list3.next = list2;
                list2 = list2.next;
            }
            list3 = list3.next;
        }
        if (list1 == null) {
            list3.next = list2;
        } else {
            list3.next = list1;
        }
        return p.next;
    }

    public static void main(String[] args) {
        int[] l1 = {1, 2, 4};
        ListNode list1 = new ListNode();
        int[] l2 = {1, 3, 4};
        ListNode list2 = new ListNode();
        ListNode p1 = list1;
        ListNode p2 = list2;
        for (int value : l1) {
            ListNode s = new ListNode();
            s.val = value;
            s.next = null;
            list1.next = s;
            list1 = list1.next;
        }
        for (int value : l2) {
            ListNode s = new ListNode();
            s.val = value;
            s.next = null;
            list2.next = s;
            list2 = list2.next;
        }
        ListNode p = mergeTwoLists(p1.next, p2.next);
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }
}
