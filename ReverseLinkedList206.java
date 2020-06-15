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
class ReverseLinkedList206 {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        Stack<ListNode> stack = new Stack<ListNode>();
        while(head != null){
            stack.push(new ListNode(head.val, null));
            head = head.next;
        }
        head = stack.pop();
        ListNode result = head;
        while(!stack.empty()){
            ListNode current = stack.pop();
            result.next = current;
            result = current;
        }
        result.next = null;
        return head;
    }
}