package Trees;

public class CompleteTree {

    public static void main(String[] args) {
        Node root = null;
        int A[] = new int[]{2,1,3};
        for (int i = 0; i < A.length; i++) {
            root = createTree(root, A[i]);
        }
        int n = size(root);
        System.out.println("size = " + n);
        System.out.println();
        System.out.println(isComplete(root));
    }
    public static int size(Node root){
        if(root==null)
            return 0;
        return 1+size(root.left)+size(root.right);
    }

    public static boolean isComplete(Node root){
        if(root==null)
            return true;
        boolean Arr[] = new boolean[size(root)];
        inorder(root, Arr, 0);
        int f=0;
        for(boolean e:Arr){
            if(e==false)
            {   f=1;    break;  }
        }
        if(f==0)
        {System.out.println("yes complete ");
        return true;}
        else
        {System.out.println("not complete ");
        return false;}
    }

    public static void inorder(Node root, boolean A[], int i){
        if(root==null || i>A.length)
            return;
        inorder(root.left, A, i*2+1);
        A[i] = true;
        inorder(root.right, A, i*2+2);
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
