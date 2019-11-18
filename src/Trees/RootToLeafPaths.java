package Trees;

public class RootToLeafPaths {

    public static void main(String[] args) {
        Node root1 =null;
        Node root2 = null;
        root1 = createTree(root1, 5);
        root1 = createTree(root1, 3);
        root1 = createTree(root1, 4);
        root1 = createTree(root1, 2);
        root1 = createTree(root1, 6);
        root1 = createTree(root1, 7);
        //root1 = createTree(root1, 8);
        pathsToLeaf(root1);
    }

    public static void pathsToLeaf(Node root){

        int A[] = new int[10];
        printPaths(root, A, 0);
    }

    public static void printPaths(Node root, int A[], int index){
        if(root!=null)
            A[index++] = root.data;
        if(root.left==null && root.right==null){
            for(int i=0;i<A.length;i++)
                System.out.print(A[i] + " ");
        }
        System.out.println();
        if(root.left!=null)
        printPaths(root.left, A, index);
        if(root.right!=null)
        printPaths(root.right, A, index);
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
