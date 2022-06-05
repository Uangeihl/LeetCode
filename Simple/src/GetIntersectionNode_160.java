import java.util.Stack;

/**
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
 * 图示两个链表在节点 c1 开始相交：
 */
public class GetIntersectionNode_160 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        /*Stack<ListNode> stackA = new Stack<>();
        Stack<ListNode> stackB = new Stack<>();
        while (headA != null) {
            stackA.push(headA);
            headA = headA.next;
        }
        while (headB != null) {
            stackB.push(headB);
            headB = headB.next;
        }
        ListNode ret = null;
        while (!stackA.empty() && !stackB.empty()) {
            ListNode nodeA = stackA.pop();
            ListNode nodeB = stackB.pop();
            if (nodeA == nodeB) {
                ret = nodeA;
            } else break;
        }
        return ret;*/
        ListNode p1 = headA;
        ListNode p2 = headB;
        while (p1 != p2) {
            if (p1 != null) {
                p1 = p1.next;
            } else {
                p1 = headB;
            }
            if (p2 != null) {
                p2 = p2.next;
            } else {
                p2 = headA;
            }
        }
        return p1;
    }

    public static void main(String[] args) {
        ListNode c = new ListNode(8,
                new ListNode(4,
                        new ListNode(5, null)));
//        ListNode c = null;
        ListNode headA = new ListNode(4,
                new ListNode(1,
                        c));
        ListNode headB = new ListNode(5,
                new ListNode(6,
                        new ListNode(1,
                                c)));
        System.out.println(getIntersectionNode(headA, headB).val);
    }
}
