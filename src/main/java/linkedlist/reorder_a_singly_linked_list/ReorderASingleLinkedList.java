package linkedlist.reorder_a_singly_linked_list;

import linkedlist.add_two_singly_linked_list.AddTwoSingleLinkedList;
import linkedlist.reverse_a_linked_list.ReserveALinkedList;

/**
 *
 * @author Tanmoy Mukherjee
 */
public class ReorderASingleLinkedList {
    public static void main(String[] args){

        ListNode head = new ListNode(0);
        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(-9);
        ListNode n4 = new ListNode(7);
        ListNode n5 = new ListNode(3);
        ListNode n6 = new ListNode(-1);
        ListNode n7 = new ListNode(-3);

        head.next=n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        traverseLinkedList(head);
        System.out.println("After reorder.....");
        reorderList(head);

    }

    public static void reorderList(ListNode head) {
        // Find middle element using slow and fast pointer
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode l1 = head;
        ListNode l2 = reverseALinkedList(slow);
        // traverseLinkedList(middle); // Working
        while (l1 != null && l2 != null){
      System.out.println("Inside while........................................................");
            if(l1 == l2){
        System.out.println("Inside brak.......");
                l1.next = null;
                break;
            }
            ListNode l1Next = l1.next;
      //System.out.println("headNext.val = " + head.next.val);
            ListNode l2Next = l2.next;
      //System.out.println("middle.next.val = " + middle.next.val);
            l1.next = l2;
            l2.next = l2Next;
            l1 = l1Next;
            l2 = l2Next;
        }
    System.out.println("head.val ##################################################### " + head.val);
        traverseLinkedList(head);
    }

    private static ListNode reverseALinkedList(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode previous = head;
        ListNode current = head.next;
        head.next = null;
        while (current != null){
            ListNode next = current.next;
            current.next= previous;
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
