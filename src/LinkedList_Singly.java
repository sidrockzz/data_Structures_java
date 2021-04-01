public class LinkedList_Singly {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){ data =d; next=null;};
    }
    public static void main(String [] args){
        LinkedList_Singly l = new LinkedList_Singly();
        l.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        l.head.next = second;
        second.next = third;
    }
}
