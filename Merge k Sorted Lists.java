/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((x,y)->x.val-y.val);
        ListNode res=new ListNode(0);
        ListNode p = res;
        for(int i = 0; i<lists.length; i++){
            if(lists[i] != null){
                pq.offer(lists[i]);
            }
        }
        while(!pq.isEmpty()){
            ListNode node=pq.poll();
            if(node.next != null) pq.offer(node.next);
            p.next=node;
            p=p.next;
        }
        return res.next;
    }
}
