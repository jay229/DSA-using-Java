class SingleLL {

    // To point the first node of Linked List
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    // insert Node at the begining
    public void insertAtFront(int value) {
        Node n1 = new Node(value);
        if (head == null) {
            head = n1;
            return;
        }
        n1.next = head;
        head = n1;
    }

    // Insert node at the end
    public void insertAtEnd(int value) {
        Node n1 = new Node(value);
        if (head == null) {
            head = n1;
            return;
        }
        Node iter = head;
        while (iter.next != null) {
            iter = iter.next;
        }
        iter.next = n1;
    }

    // Insert at given key
    public void insertAtKey(int key, int value) {
        if (head == null) {
            System.out.println(key + " does not exists");
            return;
        }
        Node iter = head;
        boolean flag = false;
        while (iter != null) {
            if (iter.data == key) {
                flag = true;
                break;
            }
            iter = iter.next;

        }
        if (flag) {
            Node n1 = new Node(value);
            Node n2 = iter.next;
            iter.next = n1;
            n1.next = n2;
            return;
        }
        System.out.println(key + " does not exists");
    }

    // Search key iteratively
    public void searchIterative(int key) {
        if (head == null) {
            System.out.println("Linked List doest not exists");
            return;
        }
        int pos = 0;
        Node iter = head;
        while (iter != null) {
            pos++;
            if (iter.data == key) {
                System.out.println(key + " is found at location " + pos);
                return;
            }
            iter = iter.next;
        }
        System.out.println(key + " does not exists");
    }

    // Search key recursively
    public void searchRecur(Node heaNode, int key, int pos) {
        if (heaNode == null) {
            System.out.println(key + " does not found");
            return;
        }
        if (heaNode.data == key) {
            System.out.println(key + " is found at location " + pos);
            return;
        }
        searchRecur(heaNode.next, key, pos + 1);

    }

    // Count no. of nodes in LinkedList
    public int getCount() {
        if (head == null)
            return 0;
        Node iter = head;
        int count = 0;
        while (iter != null) {
            count++;
            iter = iter.next;
        }
        return count;
    }

    public int getCountRecur(Node iter) {
        if (iter == null)
            return 0;
        return 1 + getCountRecur(iter.next);
    }

    // Reverse the Linked List
    public Node reversLL(Node head) {
        if (head == null)
            return head;
        Node iter = null;
        while (head != null) {
            Node next = head.next;
            head.next = iter;
            iter = head;
            head = next;

        }
        return iter;
    }

    // Reverse Linked List recursively
    public Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverse(head.next);
        Node nextHead = head.next;
        nextHead.next = head;
        head.next = null;
        return newHead;

    }

    // Delete node at beginning
    public void DeleteAtBeg() {
        if (head == null) {
            System.out.println("Deletion not possible");
            return;
        }
        head = head.next;

    }

    // Delete at given position
    public void deleteAtPos(int length, int pos) {
        if (pos > length || head == null) {
            System.out.println("Deletion not possible");
            return;
        }
        int i=1;
        Node iter=head;
        while(i<pos-1){
            iter=iter.next;
            i++;
        }
        iter.next=iter.next.next;
    }

    // To show all the nodes
    public void display() {
        if (head == null) {
            System.out.println("Nothing to display");
            return;
        }
        Node iter = head;

        while (iter != null) {
            System.out.print(iter.data + "-->");
            iter = iter.next;
        }
        System.out.println("null");
    }

}

public class Main {
    public static void main(String args[]) {
        SingleLL ll = new SingleLL();
        ll.insertAtFront(10);
        ll.insertAtFront(20);
        ll.insertAtFront(30);
        ll.insertAtFront(40);
        ll.insertAtFront(50);

        ll.display();

        // ll.insertAtEnd(60);
        // ll.insertAtEnd(70);
        // ll.display();

        // ll.insertAtKey(30, 5);
        // ll.display();

        // ll.searchIterative(30);

        // ll.searchRecur(ll.head, 30, 1);

        // System.out.println(ll.getCount());
        // System.out.println(ll.getCountRecur(ll.head));

        // ll.head=ll.reversLL(ll.head);
        // ll.display();

        // ll.head=ll.reverse(ll.head);
        // ll.display();

        // ll.DeleteAtBeg();
        // ll.display();

        ll.deleteAtPos(ll.getCount(), 3);
        ll.display();

    }

}