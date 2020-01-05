package Trees;


public class AVLTree {
    Node start;

    public static void main(String args[]) throws Exception {
        AVLTree t = new AVLTree();
        t.start = null;
        t.start = t.insertNode(t.start, 1);
        t.start = t.insertNode(t.start, 3);
        t.start = t.insertNode(t.start, 2);
        t.start = t.insertNode(t.start, 4);
        t.start = t.insertNode(t.start, 8);
        t.start = t.insertNode(t.start, 6);
        t.start = t.insertNode(t.start, 7);
        t.start = t.insertNode(t.start, 5);
        t.start = t.insertNode(t.start, 9);
        System.out.println("inorder");
        t.inOrder(t.start);
        System.out.println("\npreorder");
        t.preOrder(t.start);

        System.out.println();
        System.out.println("test" + t.start.data);
        t.start = t.deleteNode(t.start, 4);
        System.out.println("After delete1 ");
        t.inOrder(t.start);
        System.out.println();
        t.preOrder(t.start);
        t.start = t.deleteNode(t.start, 5);
        System.out.println("After delete2 ");
        t.inOrder(t.start);
        System.out.println();
        t.preOrder(t.start);
        t.start = t.deleteNode(t.start, 2);
        System.out.println("\nAfter delete3 ");
        t.inOrder(t.start);
        System.out.println();
        t.preOrder(t.start);
    }

    public void preOrder(Node root) {
        if (root == null)
            return;
        else {
            System.out.print(root.data + "---> ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void inOrder(Node start) {
        if (start == null)
            return;
        else {
            inOrder(start.left);
            System.out.print(start.data + "---> ");
            inOrder(start.right);
        }
    }

    public Node rotateRight(Node root) {
        Node newNode = root.left;
        root.left = newNode.right;
        newNode.right = root;
        root.height = max(height(root.left), height(root.right)) + 1;
        newNode.height = max(height(newNode.left), height(newNode.right)) + 1;
        return newNode;
    }

    public Node rotateLeft(Node root) {
        Node newNode = root.right;
        root.right = newNode.left;
        newNode.left = root;
        root.height = max(height(root.left), height(root.right)) + 1;
        newNode.height = max(height(newNode.left), height(newNode.right)) + 1;
        return newNode;
    }

    public Node insertNode(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data <= root.data)
            root.left = insertNode(root.left, data);
        else
            root.right = insertNode(root.right, data);
        int balance = height(root.left) - height(root.right);
        if (balance > 1) {
            if (height(root.left.left) >= height(root.left.right)) {
                return rotateRight(root);   //LL rotation
            } else {
                root.left = rotateLeft(root.left);     //LR rotation
                return rotateRight(root);
            }
        }
        if (balance < -1) {
            if (height(root.right.right) >= height(root.right.left)) {
                return rotateLeft(root);   //RR rotation
            } else
                root.right = rotateRight(root.right);      //RL rotation
            return rotateLeft(root);
        }
        root.height = 1 + max(height(root.left), height(root.right));
        return root;
    }

    public int max(int a, int b) {
        return (a >= b) ? a : b;
    }

    public int height(Node root) {
        if (root == null)
            return 0;
        else
            return root.height;
    }

    public Node deleteNode(Node root, int key) throws Exception {
        if (root == null)
            throw new Exception("Key not Found!");
        if (key < root.data)
            root.left = deleteNode(root.left, key);
        else if (key > root.data)
            root.right = deleteNode(root.right, key);
        else {      //root is to be deleted
            Node temp = null;
            if (root.left == null && root.right!=null) {
                root = root.right;
                return root;
            }
            else if (root.right == null && root.left!=null) {
                root = root.left;
                return root;
            }
            else if (root.right == null && root.left == null) {
                root = null;
                return root;
            }
            else {
                temp = findMax(root.left);
                root.left= deleteMax(root.left);
                root.data = temp.data;
                temp = null;
//                root.left = deleteNode(root.left, temp.data);
            }

        }

        //root.height = max(height(root.left), height(root.right)) + 1;

        int balance = height(root.left) - height(root.right);
        if (balance > 1) {
            if (height(root.left.left) >= height(root.left.right)) {
                return rotateRight(root);   //LL rotation
            } else {
                root.left = rotateLeft(root.left);     //LR rotation
                return rotateRight(root);
            }
        }
        if (balance < -1) {
            if (height(root.right.right) >= height(root.right.left)) {
                return rotateLeft(root);   //RR rotation
            } else
                root.right = rotateRight(root.right);      //RL rotation
            return rotateLeft(root);
        }
        root.height = 1 + max(height(root.left), height(root.right));


        System.out.println("CAme here");
        return root;
        //return new Node(10);
    }

    public Node findMax(Node r) {
        Node root = r;
        while (root.right != null)
            root = root.right;
        return root;
    }
    public Node deleteMax(Node root){
        if(root.right == null){
            return null;
        }
        else
            root.right = deleteMax(root.right);
        return root;
    }
}