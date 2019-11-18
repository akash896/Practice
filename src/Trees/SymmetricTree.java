package Trees;

public class SymmetricTree {

    public static void main(String[] args) {
        Node root1 =null;
        Node root2 = null;
        root1 = createTree(root1, 1);
        root1 = createTree(root1, -2);
        root1 = createTree(root1, 3);
        root1 = createTree(root1, -4);
        root1 = createTree(root1, 2);
        //root1 = createTree(root1, 6);
        //root1 = createTree(root1, 8);
        System.out.println(isSymmetric(root1));
    }

    public static boolean isSymmetric(Node root){
        if(root==null)
            return false;
        return isSymmetric(root.left, root.right);
    }

    public static boolean isSymmetric(Node root1, Node root2){
        if(root1==null && root2==null)
            return true;
        return (root1!=null && root2!=null) && isSymmetric(root1.left, root2.right) && isSymmetric(root1.right, root2.left);
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

}
