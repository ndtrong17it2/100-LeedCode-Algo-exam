/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MiddleOfLinkedList876 {
    public ListNode middleNode(ListNode head) {
        List<ListNode> listNode = new ArrayList<ListNode>();
        while(head != null){
            listNode.add(head);
            head = head.next;
        }
        return listNode.get(listNode.size() / 2);
    }
}