/*
 * Example usage of my custom Node class.
 */
public class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int weight) {
        root = insertRecursive(root, weight);
    }

    private Node insertRecursive(Node root, int weight) {
        if (root == null) {
            return new Node(weight);
        }
        //
        if (weight < root.weight) {
            root.l = insertRecursive(root.l, weight);
        } else if (weight > root.weight) {
            root.r = insertRecursive(root.r, weight);
        }

        return root;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Insert elements into the tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

    }
}
