package linkedlist.easy;

/**
 * My Linked List implementation
 *
 * @author Tanmoy Mukherjee
 */
public class MyLinkedList {
    public static void main(String[] args){
         Node<Integer> head = new Node<>(1);
         Node<Integer> n1 = new Node<>(2);
         Node<Integer> n2 = new Node<>(3);
         Node<Integer> n3 = new Node<>(4);
         head.next=n1;
         n1.next = n2;
         n2.next = n3;
    traverseLinkedList(head);
    }
    private  static void traverseLinkedList(Node<Integer> head){
        Node<Integer> temp = head;
        while (temp != null){
            System.out.print(temp.val+" - > ");
            temp = temp.next;
    }
  }
    static class Node<T>{
        T val;
        Node next;
        public Node(T val){
            this.val = val;
            this.next = null;
        }
    }
}
