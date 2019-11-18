package Trees;

// problem is to convert a given binary tree to its mirror form
public class MirrorTree {

    public static void main(String[] args) {
        int A[] = new int[]{5, 3, 2, 4, 7, 6, 8};
        Node root = null;
        for (int i = 0; i < A.length; i++) {
            root = createTree(root, A[i]);
        }
        root = makeMirror(root);
        inorder(root);
    }

    public static Node makeMirror(Node root) {
        if(root==null)
            return null;
        //making mirror in post order
        makeMirror(root.left);
        makeMirror(root.right);
        root = swap(root);
        return root;
    }

    public static Node swap(Node root) {
        if(root == null)
            return root;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }

    public static void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }

    public static Node createTree(Node root, int d){
            if(root == null)
                return new Node(d);
            if(d < root.data)
                root.left = createTree(root.left , d);
            else
                root.right = createTree(root.right, d);
            return root;
        }
    }

