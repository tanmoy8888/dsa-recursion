package linkedlist.add_two_singly_linked_list;


import linkedlist.easy.MyLinkedList;
import linkedlist.single_linkedlist_palindrome.Palindrome;

/**
 *
 * @author Tanmoy Mukherjee
 */
public class AddTwoSingleLinkedList {
    public static void main(String[] args){

        ListNode head1 =new ListNode(7);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(3);

        head1.next=n1;
        n1.next = n2;
        n2.next = n3;

        ListNode head2 =new ListNode(5);
        ListNode h1 = new ListNode(6);
        ListNode h2 = new ListNode(4);

        head2.next=h1;
        h1.next = h2;
        ListNode finalHead = addTwoNumbers(head1,head2);
        traverseLinkedList(finalHead);


    }

    private static ListNode addTwoNumbers(ListNode A, ListNode B){
        ListNode r1 = reverseALinkedList(A);
        ListNode r2 = reverseALinkedList(B);
        int carry = 0;
        ListNode temp = null;
        ListNode answer = null;
        while (r1 != null || r2 != null || carry != 0){
            int sum = carry;
            if(r1 != null){
                sum += r1.val;
                r1 = r1.next;
            }
            if(r2 != null){
                sum += r2.val;
                r2 = r2.next;
            }
            int digit = sum % 10;
            carry = sum /10;
            ListNode newNode = new ListNode(digit);
            if(answer == null){
                answer = temp = newNode;
            }else{
                temp.next = newNode;
                temp = newNode;
            }
        }
     return reverseALinkedList(answer);
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
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() { val = 0; next = null; }
        ListNode(int val) { this.val = val; next = null; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
