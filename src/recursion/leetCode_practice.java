package recursion;

import java.util.List;

public class leetCode_practice {

    /**
     * user recursion to solve no.203
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,3,4,2};
        ListNode arr0 = new ListNode(arr);
        System.out.println(arr0);
        System.out.println((new Solution()).removeElements(arr0,3));
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

        ListNode(int[] arr) {
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Failed, arr is empty");
            }
            val = arr[0];
            ListNode cur = this;
            for (int i = 1; i < arr.length; i++) {
                cur.next = new ListNode(arr[i]);
                cur = cur.next;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("List: ");
            for (ListNode cur = this; cur.next != null; cur = cur.next) {
                sb.append(cur.val + "->");
            }
            sb.append("Null");
            return sb.toString();
        }
    }

    static class Solution {
        public ListNode removeElements(ListNode head, int val) {
            if (head == null) return null;
            head.next = removeElements(head.next, val);
            return head.val == val? head.next: head;
        }
    }
}
