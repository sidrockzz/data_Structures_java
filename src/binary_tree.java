class Node{
    int value;
    Node right;
    Node left;
    Node(int value){
        this.value = value;
        left = null;
        right = null;
    }
}
public class binary_tree {
    static Node root;
    private Node addR(Node current,int value){
        if(current == null){
            return new Node(value);
        }
        if(value< current.value) current.left = addR(current.left,value);
        else if(value> current.value) current.right = addR(current.right,value);
        else return current;
        return current;
    }
    public void add(int value){
        root = addR(root, value);
    }
    public void inorder(Node current){
        if(current == null) return;
        inorder(current.left);
        System.out.print(current.value+" ");
        inorder(current.right);
    }
    public void postorder(Node current){
        if(current == null) return;
        postorder(current.left);
        postorder(current.right);
        System.out.print(current.value+" ");
    }
    public void preorder(Node current){
        if(current == null) return;
        System.out.print(current.value+" ");
        preorder(current.left);
        preorder(current.right);
    }
    public static void main(String [] args){
        binary_tree bt = new binary_tree();
        bt.add(10);
        bt.add(11);
        bt.add(12);
        bt.add(13);
        bt.inorder(root);
        System.out.println();
        bt.preorder(root);
        System.out.println();
        bt.postorder(root);
    }
}