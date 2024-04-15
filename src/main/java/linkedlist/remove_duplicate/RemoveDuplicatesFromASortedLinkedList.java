package linkedlist.remove_duplicate;

/**
 * @author Tanmoy Mukherjee
 */
public class RemoveDuplicatesFromASortedLinkedList {
    public static void main(String[] args){

        Node<Integer> head= new Node<>(1);
        Node<Integer> n1 = new  Node<>(2);
        Node<Integer> n2 = new  Node<>(3);
        Node<Integer> n3 = new  Node<>(4);
        Node<Integer> n4 = new  Node<>(5);
        Node<Integer> n5 = new  Node<>(6);
        Node<Integer> n6 = new  Node<>(7);
        Node<Integer> n7 = new  Node<>(8);
        head.next=n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        Node<Integer> node = findMiddleElement(head);
        System.out.println("node.val = " + node.val);
  }

  private static Node findMiddleElement(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static class Node<T>{
        T val;
        Node<T> next;
        public Node(T val){
            this.val = val;
            this.next = null;
        }
    }
}
