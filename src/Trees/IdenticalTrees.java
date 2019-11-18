package Trees;

public class IdenticalTrees {

    public static void main(String[] args) {

        Node root1 = null;
        Node root2 = null;

        // TREE1
        root1 = createTree(root1, 5);
        root1 = createTree(root1, 4);
        root1 = createTree(root1, 3);
        root1 = createTree(root1, 2);
        root1 = createTree(root1, 6);

        //TREE2
        root2 = createTree(root2, 5);
        root2 = createTree(root2, 4);
        root2 = createTree(root2, 3);
        root2 = createTree(root2, 2);
        root2 = createTree(root2, 9);

        System.out.println(isIdentical(root1, root2));
    }// main ends

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

    public static boolean isIdentical(Node root1, Node root2){
        if(root1 == null && root2 == null)
            return true;
        if(root1==null && root2!=null || root1!=null && root2==null)
            return false;
        return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right) && (root1.data==root2.data);
    }
}
