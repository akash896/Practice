package Trees;

public class InorderSuccessor {
    public static void main(String[] args) {
        Node root = null;
        root = createTree(root, 5);
        root = createTree(root, 3);
        root = createTree(root, 2);
        root = createTree(root, 4);
        root = createTree(root, 7);
        root = createTree(root, 6);
        root = createTree(root, 8);
       // findInorderSuccessor(root);
    }

    public static Node createTree(Node root, int d){
        if(root == null) {
            root = new Node(d);
            return root;
        }
        if(d < root.data)
            root.left = createTree(root.left, d);
        else
            root.right = createTree(root.right, d);
        return root;

        //complete it....................
    }



}
