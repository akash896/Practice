package Trees;
// the problem is to find path to a perticular node in a binary tree
public class FindPath {

    public static void main(String[] args) {
        Node root1 =null;
        Node root2 = null;
        root1 = createTree(root1, 5);
        root1 = createTree(root1, 3);
        root1 = createTree(root1, 4);
        root1 = createTree(root1, 2);
        root1 = createTree(root1, 8);
        root1 = createTree(root1, 7);
        root1 = createTree(root1, 6);
        findPath(root1, 6);
    }

    public static void findPath(Node root, int v){

        int A[] = new int[10];
        printPaths(root, A, 0, v);
    }

    public static void printPaths(Node root, int A[], int index, int value){
        if(root!=null)
            A[index++] = root.data;
        if(root.data==value){
            for(int i=0;i<index;i++)
                System.out.print(A[i] + " ");
        }
        System.out.println();
        if(root.left!=null)
            printPaths(root.left, A, index, value);
        if(root.right!=null)
            printPaths(root.right, A, index, value);
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
