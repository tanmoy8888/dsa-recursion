package linkedlist.easy;

/**
 * @author Tanmoy Mukherjee
 */
public class InsertDataIntoAnExistingLinkedList {
    public static void main(String[] args){
        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(4);
        head.next=n1;
        n1.next = n2;
        n2.next = n3;
        traverseLinkedList(head);
        System.out.println("\n After inserting data in second index position");
        //insertDataIntoASpecificPosition(2,5,head);
        Node<Integer> node = insertDataIntoASpecificPosition(0, 5, head);
        traverseLinkedList(node);
    }

    private static Node<Integer> insertDataIntoASpecificPosition(int pos,int data, Node<Integer> head){
        Node<Integer> newNode = new Node<>(data);
            if(pos == 0){
              newNode.next = head;
              return newNode;
            }
            Node<Integer> temp = head;
            for(int i = 0; i < pos-1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
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
        Node<T> next;
        public Node(T val){
            this.val = val;
            this.next = null;
        }
    }
}
