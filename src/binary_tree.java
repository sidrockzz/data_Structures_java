import java.util.LinkedList;
import java.util.Queue;

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
    private boolean findR(Node current, int value){
        if(current==null) return false;
        if( value == current.value) return true;
        return value<current.value ? findR(current.left,value)
                :findR(current.right,value);
    }
    public boolean find(int value){
        return findR(root,value);
    }
    private Node deleteR(Node current,int value){
        if(current == null) return null;
        if(value == current.value){
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }
            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteR(current.right, smallestValue);
            return current;
        }
        if(value<current.value){
            current.left = deleteR(current.left,value);
            return current;
        }
        current.right = deleteR(current.right,value);
        return current;
    }
    public void delete(int value) {
        root = deleteR(root, value);
    }
    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }
    public void bfs(){
        if(root == null) return;
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        while(!nodes.isEmpty()){
            Node node = nodes.remove();
            System.out.print(node.value+" ");
            if(node.left!=null) nodes.add(node.left);
            if(node.right!=null) nodes.add(node.right);
        }
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
        System.out.println();
        bt.bfs();
        System.out.println();
        System.out.println(bt.find(11));
        System.out.println(bt.find(23));
        bt.delete(10);
        bt.delete(13);
        bt.inorder(root);
    }
}