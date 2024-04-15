package linkedlist.remove_duplicate;

/**
 * Program : Given a sorted linked list , delete all duplicates and return the sorted linked list as well.
 *
 * @author Tanmoy Mukherjee
 */
public class RemoveDuplicatesFromASortedLinkedList {
    public static void main(String[] args){

        Node<Integer> head= new Node<>(1);
        Node<Integer> n1 = new  Node<>(1);
        Node<Integer> n2 = new  Node<>(2);
        Node<Integer> n3 = new  Node<>(3);
        Node<Integer> n4 = new  Node<>(3);
        Node<Integer> n5 = new  Node<>(3);
        Node<Integer> n6 = new  Node<>(4);
        Node<Integer> n7 = new  Node<>(5);

        head.next=n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        traverseLinkedList(head);
        Node<Integer> newHead = removeDuplicatesFromLinkedList(head);
        System.out.println("Removed duplicate elemenets.....");
        traverseLinkedList(newHead);

   }

   private static Node<Integer> removeDuplicatesFromLinkedList(Node<Integer> head){
        Node<Integer> nonRepeatingElement = head;
        Node<Integer> temp = head;
        Node<Integer> newHead = null;
        while (nonRepeatingElement != null){
      System.out.println("First while nonRepeatingElement -------------------------------- " + nonRepeatingElement.val);
              while (nonRepeatingElement.next != null && nonRepeatingElement.val == nonRepeatingElement.next.val){
                  nonRepeatingElement = nonRepeatingElement.next;
        System.out.println("Second while nonRepeatingElement.val ############################### " + nonRepeatingElement.val);
              }
              if(newHead == null){
                  newHead = temp = nonRepeatingElement;
        System.out.println("newHead.val = " + newHead.val);
        System.out.println("temp.val = " + temp.val);
        System.out.println("nonRepeatingElement.val = " + nonRepeatingElement.val);
              }else{
                  temp.next = nonRepeatingElement;
                  temp = nonRepeatingElement;
        System.out.println("temp.next.val = " + temp.next.val);
        System.out.println("temp.val = " + temp.val);
              }
              nonRepeatingElement = nonRepeatingElement.next;
      System.out.println("End.....................@@@@@@............nonRepeatingElement.val = " + nonRepeatingElement.val);
        }
        return  newHead;
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
        Node<T> next;
        public Node(T val){
            this.val = val;
            this.next = null;
        }
    }
}
