package linkedlist.easy.doublyLinkedList;

/**
 * Insert data into Doubly Linked List implementation
 *
 * @author Tanmoy Mukherjee
 */
public class InsertDataIntoDoublyLinkedList {
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
    // Insert data into doubly linked list in a specific index position
        System.out.println("\n After inserting data in to specif index position");
        Node<Integer> newNode = insertDataIntoDoublyLinkedList(2, 5, head);
        traverseLinkedList(newNode);
    }

    private static Node<Integer> insertDataIntoDoublyLinkedList(int pos , int data , Node<Integer> head){
        Node<Integer> newNode = new Node<>(data);
        if(pos == 0){
         newNode.next = head;
         head.previous = newNode;
         return newNode;
        }
        Node<Integer> temp = head;
        for(int i = 0; i < pos-1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next.previous = newNode;

        temp.next = newNode;
        newNode.previous = temp;
        return head;
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
