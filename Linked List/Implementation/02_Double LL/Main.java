class DoubleLL {
    Node head;
    Node tail;

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

    }
    public void addAtFirst(int data){
        Node n1=new Node(data);
        if(head==null && tail==null){
            head=n1;
            tail=n1;;
            return;
        }
        n1.next=head;
        head.prev=n1;
        head=n1;
    }

    public void addAtEnd(int data){
        Node n1=new Node(data);
        if(head==null && tail==null){
            head=n1;
            tail=n1;;
            return;
        }
       tail.next=n1;
       n1.prev=tail;
       tail=n1;
    }

    public void deleteAtEnd(){
        if(tail==null){
            System.out.println("Invalid deletion operation");
            return;
        }
        tail=tail.prev;
        tail.next=null;
    }
    public void deleteAtFirst(){
        if(head==null){
            System.out.println("Invalid deletion operation");
            return;
        }
        head=head.next;
    }

    

    public void displayLtoR(){
        Node iter=head;
        while (iter!=null) {
            System.out.print(iter.data+"-->");
            iter=iter.next;
        }
        System.out.println("null");
    }

    public void displayRtoL(){
        Node iter=tail;
        while (iter!=null) {
            System.out.print(iter.data+"-->");
            iter=iter.prev;
        }
        System.out.println("null");
    }

    


}

public class Main {
    public static void main(String args[]) {
        DoubleLL ll=new DoubleLL();
        ll.addAtFirst(1);
        ll.addAtFirst(2);
        ll.addAtFirst(3);
        ll.addAtFirst(4);
        ll.addAtFirst(5);

        ll.displayLtoR();
        // ll.displayRtoL();

        // ll.addAtEnd(1);
        // ll.addAtEnd(2);
        // ll.addAtEnd(3);
        // ll.addAtEnd(4);
        // ll.addAtEnd(5);

        // ll.displayLtoR();
        // ll.displayRtoL();

        // ll.deleteAtFirst();
        // ll.displayLtoR();

        ll.deleteAtEnd();
        ll.displayLtoR();
        
    }
}