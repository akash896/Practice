package Trees;
// problem is to find diameter of a tree.
// diameter is the longest route between two leaf nodes of the tree

public class Diameter {

    public static void main(String[] args) {
        Node root = null;
        root = createTree(root, 5);
        root = createTree(root, 3);
        root = createTree(root, 2);
        root = createTree(root, 4);
        root = createTree(root, 7);
        root = createTree(root, 6);
        root = createTree(root, 8);
        root = createTree(root, 9);
        System.out.println(findDiameter(root));
    }

    public static int findDiameter(Node root){
        if(root == null)
            return 0;
        int lheight = height(root.left);
        int riheight = height(root.right);
        int ldiameter = findDiameter(root.left);
        int rdiameter = findDiameter(root.right);
        return max(lheight + riheight + 1, max(ldiameter, rdiameter));
    }

    public static int height(Node root){
        if(root==null)
            return 0;
        return 1 + max(height(root.left), height(root.right));
    }

    public static int max(int a, int b){
        return a>b? a : b;
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
