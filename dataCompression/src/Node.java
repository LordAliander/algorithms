/*
 * Class that represents a node inside a binary tree. These nodes can be concatenated to create a tree structure.
 */
public class Node {
    int weight;
    Node l;
    Node r;
    public Node(int weight) {
        this.weight = weight;
        this.l = null;
        this.r = null;
    }
}
