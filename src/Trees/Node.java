package Trees;

public class Node {
    int data;
    Node right;
    Node left;
    int height;

    public Node(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
        this.height = 1;
    }
}
