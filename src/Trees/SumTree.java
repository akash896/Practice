package Trees;

public class SumTree {

    public static void main(String[] args) {
        Node root = null;
        root = createTree(root, 5);
        root = createTree(root, 3);
        root = createTree(root, 2);
        root = createTree(root, 4);
        root = createTree(root, 7);
        root = createTree(root, 6);
        root = createTree(root, 8);
        //System.out.println(sumTree(root));
        //root = post(root);
        inorder(root);
        System.out.println();
        sumTree(root);
        inorder(root);
    }

    public static int sumTree(Node root){
        if(root == null)
            return 0;
//        root.data = sumTree(root.left) + sumTree(root.right);
//        return root.data + sumTree(root.left) + sumTree(root.right);
        int old = root.data;
        int k = sumTree(root.left) + sumTree(root.right);
        if(k!=0)
            root.data =k;
        return old + root.data;
    }

    public static Node post(Node root){
        if(root==null)
            return null;
        if(root.left!=null)
        root = post(root.left);
        if(root.right!=null)
        root = post(root.right);
        root.data = sumTree(root);
        return root;
    }

    public static void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
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
