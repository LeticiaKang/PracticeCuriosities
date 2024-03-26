package Tree;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    Node root;

    public void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.println(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left  = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("======");
        tree.preOrder(tree.root);
    }
}
