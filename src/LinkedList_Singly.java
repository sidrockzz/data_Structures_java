public class LinkedList_Singly {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){ data =d; next=null;};
    }
    public void print(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
    }
    //Inserts a new node at front of the list
    public void push(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
    public static void main(String [] args){
        LinkedList_Singly l = new LinkedList_Singly();
        l.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        l.head.next = second;
        second.next = third;
        l.print();
    }
}
