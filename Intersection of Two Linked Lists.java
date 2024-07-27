public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null) return headA;
    if (headB == null) return headB;

    Set<ListNode> nodeAddress = new HashSet<>();

    while (headA != null) {

      nodeAddress.add(headA);
      headA = headA.next;
    }

    ListNode result = null;

    while (headB != null) {
      if (nodeAddress.contains(headB))
        return headB;

      headB = headB.next;
    }

    return result;
    }
}
