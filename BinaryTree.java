class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

    public void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    public void preorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public void postorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.print("In-order Traversal: ");
        tree.inorderTraversal(tree.root);
        System.out.println();

        System.out.print("Pre-order Traversal: ");
        tree.preorderTraversal(tree.root);
        System.out.println();

        System.out.print("Post-order Traversal: ");
        tree.postorderTraversal(tree.root);
        System.out.println();
    }
}
