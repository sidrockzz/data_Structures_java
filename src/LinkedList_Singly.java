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
        System.out.println();
    }
    //Inserts a new node at front of the list
    public void push(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
    // inserts a new node after the prev given node
    public void insertAfter(Node node, int data){
        if(node == null){
            System.out.println("The previous node mst not be null");
            return;
        }
        Node new_node = new Node(data);
        new_node.next = node.next;
        node.next = new_node;
    }
    //Appends a new node at the end
    public void append(int data){
        Node new_node = new Node(data);
        if(head==null){
            head = new Node(data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while(last.next!= null) last = last.next;
        last.next = new_node;
    }
    public void deleteNode(int key){
        Node temp = head,prev = null;
        if(temp!=null && temp.data==key){
            head = temp.next;
            return;
        }
        while(temp!=null && temp.data!=key){
            prev = temp;
            temp=temp.next;
        }
        if(temp==null)
            return;
        prev.next = temp.next;
    }
    public void deleteNodePos(int pos){
        if(head == null) return;
        Node temp = head;
        if(pos ==0){
            head = temp.next;
            return;
        }
        for(int i=0;temp!=null && i<pos-1;i++)
            temp = temp.next;
        if(temp==null|| temp.next== null)
            return;
        Node next = temp.next.next;
        temp.next=next;
    }
    public void deletelist(){
        head = null;
    }
    public static void main(String [] args){
        LinkedList_Singly l = new LinkedList_Singly();
        l.append(6);
        l.push(7);
        l.push(8);
        l.append(9);
        l.insertAfter(l.head.next.next,10);
        l.print();
        l.deleteNode(9);
        l.print();
        l.deleteNodePos(2);
        l.print();
        l.deletelist();
        System.out.println("Linked list is deleted");
    }
}
