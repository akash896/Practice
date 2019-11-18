package Trees;

public class BoundaryView {
    public static void main(String[] args) {
        Node root = null;
        root = createTree(root, 5);
        root = createTree(root, 3);
        root = createTree(root, 2);
        root = createTree(root, 4);
        root = createTree(root, 7);
        root = createTree(root, 6);
        root = createTree(root, 8);
        boundaryView(root);
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
    }

    public static void boundaryView(Node root){
        if(root==null)
            return;
        leftView(root);
        leafView(root);
        rightView(root.right);
    }

    public static void leftView(Node root){
        if(root==null)
            return;
        if(root.left==null && root.right==null)
            return;
        System.out.print(root.data + " ");
        if(root.left==null)
            leftView(root.right);
        else
        leftView(root.left);
    }

    public static void leafView(Node root){
        if(root==null)
            return;
        if(root.left==null && root.right==null)
            System.out.print(root.data + " ");
        leafView(root.left);
        leafView(root.right);
    }

    public static void rightView(Node root){
        if(root==null)
            return;
        if(root.left==null && root.right==null)
            return;
        if(root.right==null)
            rightView(root.left);
        else
        rightView(root.right);
        System.out.print(root.data + " ");
    }
}
