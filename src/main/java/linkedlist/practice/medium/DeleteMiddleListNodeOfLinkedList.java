package linkedlist.practice.medium;


/**
 * Delete Middle ListNode of Linked List
 * Linked List
 * AmazonVisaIntuitMicrosoft
 * Problem Statement
 * You are given the head of a linked list. Delete the middle ListNode, and return the head of the modified linked list.
 *
 *
 *
 * The middle ListNode of a linked list of size n is the ⌊n / 2⌋th ListNode from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.
 *
 * Example 1:
 * Input:
 *
 * head = [1, 2, 3, 4, 5]
 *
 * Output:
 *
 * [1, 2, 4, 5]
 *
 * Example 2:
 * Input:
 *
 * head = [2, 4, 8, 6]
 *
 * Output:
 *
 * [2, 4, 6]
 *
 * Constraints:
 * 1 <= ListNode value <= 105
 *
 * Each list has at most 105 ListNodes
 *
 * @author Tanmoy Mukherjee
 */
public class DeleteMiddleListNodeOfLinkedList {
    public static void main(String[] args){
        ListNode head= new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(6);
        ListNode n6 = new ListNode(7);
        //ListNode n7 = new ListNode(8);
        head.next=n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        //n6.next = n7;

        traverseLinkedList(head);
        System.out.println("After deleting the middle element.....");
        deleteMiddle(head);
        traverseLinkedList(head);
    }


    public static ListNode deleteMiddle(ListNode head) {
     ListNode slow = head;
     ListNode fast = head;
     int position = 0;
     while (fast != null && fast.next != null){
         slow = slow.next;
         fast = fast.next.next;
         position++;
     }
     return removeFromSpecificPosition(position, head);
    }

    private static ListNode removeFromSpecificPosition(int pos , ListNode head){
        ListNode temp = head;
        for(int i = 0; i < pos-1 ; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

   private static void traverseLinkedList(ListNode head){
        ListNode temp = head;
        while (temp != null){
           System.out.print(temp.val+"-->");
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
