import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;

    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class Remove_Duplicates {

    public static Node removeDuplicate(Node head) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        Node iter = head;
        while (iter != null) {
            set.add(iter.data);
            iter = iter.next;
        }
        iter = head;
        Iterator<Integer> itr = set.iterator();
        LinkedList ll = new LinkedList();
        while (itr.hasNext()) {
            Node new_node = new Node(itr.next());
            ll.addToTheLast(new_node);

        }
        return ll.head;
    }

}