class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
            l2 = reverseList(l2);
            return reverseList(addTwoNumbersUtil(l1, l2));
        }

        public ListNode addTwoNumbersUtil(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(-1);
            ListNode current = dummyHead;

            int carry = 0;
            while (l1 != null || l2 != null || carry != 0) {
                int sum = carry;
                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }

                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }

                current.next = new ListNode(sum % 10);
                current = current.next;
                carry = sum / 10;
            }

            return dummyHead.next;
        }

        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null)
                return head;
            ListNode p = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return p;
    }
}
