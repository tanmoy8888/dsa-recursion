package linkedlist.practice.medium;



/**
 * @author Tanmoy Mukherjee
 */
public class ReverseALinkedList {
    public static void main(String[] args){
        ListNode head =new ListNode(1);
        ListNode n1 = new  ListNode(2);
        ListNode n2 = new  ListNode(3);
        ListNode n3 = new  ListNode(4);
        ListNode n4 = new  ListNode(5);

        head.next=n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        traverseLinkedList(head);

        ListNode newHead = reverseLinkedList(head);
        traverseLinkedList(newHead);
    }

    private static ListNode reverseLinkedList(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode current = head.next;
        ListNode previous = head;
        // If this is not done then it will go to infinite loop
        head.next = null;
        while (current != null){
            ListNode next = current.next;
            current.next = previous;
            // update current snd previous for next iterations
            previous = current;
            current = next;
        }
        return previous;

    }

    private  static void traverseLinkedList(ListNode head){
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
    System.out.println();
  }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() { val = 0; next = null; }
        ListNode(int val) { this.val = val; next = null; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
