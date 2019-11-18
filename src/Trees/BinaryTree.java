package Trees;

public class BinaryTree {
    public static void main(String[] args) {
        int A[] = new int[]{5,3,2,4,1,6,7,8,9};
        Node root = null;
        for(int i=0 ; i<A.length; i++){
            root = createTree(root, A[i]);
        }
        inorder(root);
        System.out.println();
        root = deleteNode(root, 6);
        inorder(root);
        System.out.println();
        root = deleteNode(root, 8);
        inorder(root);
    }// main ends

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

    public static Node deleteNode(Node root, int d){
        if(root==null)
            return null;
        if(d<root.data)
            root.left = deleteNode(root.left, d);
        if(d>root.data)
            root.right = deleteNode(root.right, d);
        if(d==root.data){
            if(root.left==null)
                return root.right;
            if(root.right==null)
                return root.left;
            if(root.left!=null) {
                Node max = leftMax(root.left);
                root.data = max.data;
                root.left = deleteNode(root.left, max.data);
            }
        }
        return root;

    }

    public static Node leftMax(Node root){
        Node d = root;
        while(root.right!=null) {
            d = root;
            root = root.right;
        }
        return d;
    }
}// class ends

