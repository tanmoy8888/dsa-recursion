package linkedlist.reverse_a_linked_list;

/**
 * @author Tanmoy Mukherjee
 */
public class ReverseALinkedListWithRecursion {
 public static void main(String[] args){
     ListNode head= new ListNode(1);
     ListNode n1 = new  ListNode(2);
     ListNode n2 = new  ListNode(3);

     head.next=n1;
     n1.next = n2;
     printLinkedList(head);
     System.out.println("After Reverse using recursion");
     ListNode newHead =reverseALinkedList(head);
     printLinkedList(newHead);
  }

   private static ListNode reverseALinkedList(ListNode head){
     if(head == null || head.next == null) return head;
     ListNode headOfSubProblem = reverseALinkedList(head.next);
     head.next.next = head;
     head.next = null;
     return headOfSubProblem;
   }

    private static void printLinkedList(ListNode head){
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.val +"-->");
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
