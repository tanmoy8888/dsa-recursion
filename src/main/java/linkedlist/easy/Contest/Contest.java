package linkedlist.easy.Contest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Tanmoy Mukherjee
 */
public class Contest {
  public static void main(String[] args) {
    ListNode head = new ListNode(5);
    ListNode n1 = new ListNode(4);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(3);
    ListNode n4 = new ListNode(1);
    ListNode n5 = new ListNode(6);
    head.next = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;

      ListNode head1 = new ListNode(4);
      ListNode a1 = new ListNode(2);
      ListNode a2 = new ListNode(-1);
      ListNode a3 = new ListNode(-1);
      ListNode a4 = new ListNode(-4);
      ListNode a5 = new ListNode(0);
      head1.next = a1;
      a1.next = a2;
      a2.next = a3;
      a3.next = a4;
      a4.next = a5;

Contest con = new Contest();
con.findOriginalList(head,head1);
  }

  public ListNode findOriginalList(ListNode List1, ListNode List2) {
    // You can code here
    List<ListNode> actualList = getLinkedList(List1);
    List<ListNode> shiftPosition = getLinkedList(List2);
    int indexPosition;
    Map<Integer, ListNode> map = new HashMap<>();
    boolean keyIsduplicated = false;
    for (int i = 0; i < actualList.size() - 1; i++) {
      ListNode element = actualList.get(i);
      if (shiftPosition.get(i).val > 0) {
        indexPosition = i + shiftPosition.get(i).val;
      } else {
        indexPosition = i - Math.abs(shiftPosition.get(i).val);
      }
      if (!map.containsKey(indexPosition)) {
        map.put(indexPosition, element);
      } else {
        keyIsduplicated = true;
      }
    }
    ListNode node = null;
    for(int i = 0; i < map.size()-1; i++) {
      node = map.get(0);
    }
    prepareLinkedList(map);
    traverseLinkedList(node);
    return (keyIsduplicated) ? new ListNode(-1) : map.get(0);
  }

  private static void prepareLinkedList(Map<Integer, ListNode> map){
    for(int i = 0; i < map.size()-1; i++) {
      ListNode node = map.get(i);
      node.next = map.get(i+1);
    }
  }

  private static void traverseLinkedList(ListNode head) {
    ListNode temp = head;
    while (temp != null) {
      System.out.print(temp.val + " -> ");
      temp = temp.next;
    }
    }

  private static List<ListNode> getLinkedList(ListNode head) {
    List<ListNode> list = new ArrayList<>();
    ListNode temp = head;
    list.add(temp);
    while (temp != null) {
      temp = temp.next;
      list.add(temp);
    }
    return list;
  }
  }

class ListNode {
  int val;
  ListNode next;
  ListNode() { val = 0; next = null; }
  ListNode(int val) {
    this.val = val;
    next = null;
  }
  ListNode(int val,ListNode next) {
    this.val = val;
    this.next = next; }
}


