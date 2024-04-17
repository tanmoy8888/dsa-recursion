package linkedlist.single_linkedlist_palindrome;



/**
 * Problem Statement
 * Given a singly linked list A, determine if it's a palindrome. Return 1 or 0, indicating if the palindrome is a palindrome or not.
 *
 * Example 1:
 * Input:
 * 1 -> 2 -> 3 -> 2 -> 1
 *
 * Output:
 * 1
 *
 * Example 2:
 * Input:
 * 1 -> 2 -> 3 -> 2 -> 5
 *
 * Output:
 * 0
 *
 * Constraints:
 * 0 <= |A| <= 105
 *
 * Program : Check a single linked list is palindrome or not ?
 *
 * @author Tanmoy Mukherjee
 */
public class Palindrome {
    public static void main(String[] args){
        ListNode head =new ListNode(1);
        ListNode n1 = new  ListNode(2);
        ListNode n2 = new  ListNode(3);
        ListNode n3 = new  ListNode(2);
        ListNode n4 = new  ListNode(1);

        head.next=n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // Find middle element of the linked list;
        ListNode middle = findMiddleNode(head);
        // Now reverse the second part
       int isPalindrome = isLinkedListIsPalindrome(head);
       System.out.println("isPalindrome = " + isPalindrome);
    }

    private static int isLinkedListIsPalindrome(ListNode head){
        ListNode first = head;
        ListNode middle = findMiddleNode(first);
        ListNode second = reverseALinkedList(middle);
        while (second != null){
            if(first.val != second.val){
                return 0;
            }
            first = first.next;
            second = second.next;
        }
        return 1;
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

    private static ListNode findMiddleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
              slow = slow.next;
              fast = fast.next.next;
        }
        return slow;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() { val = 0; next = null; }
        ListNode(int val) { this.val = val; next = null; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
