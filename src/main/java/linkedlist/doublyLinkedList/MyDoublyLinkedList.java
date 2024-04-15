package linkedlist.doublyLinkedList;

/**
 * My Doubly Linked List implementation
 *
 * @author Tanmoy Mukherjee
 */
public class MyDoublyLinkedList {
    public static void main(String[] args){
         Node<Integer> head = new Node<>(1);
         Node<Integer> n1 = new Node<>(2);
         Node<Integer> n2 = new Node<>(3);
         Node<Integer> n3 = new Node<>(4);
         head.next=n1;

         n1.next = n2;
         n1.previous =  head;

         n2.next = n3;
         n2.previous =n1;

    traverseLinkedList(head);
    }
    private  static void traverseLinkedList(Node<Integer> head){
        Node<Integer> temp = head;
        while (temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
    }
  }
    static class Node<T>{
        T val;
        Node<T> previous;
        Node<T> next;
        public Node(T val){
            this.val = val;
            this.previous = null;
            this.next = null;
        }
    }
}
