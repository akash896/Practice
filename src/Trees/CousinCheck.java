package Trees;

public class CousinCheck {

    public static void main(String[] args) {
        Node root =null;
        root = createTree(root, 5);
        root = createTree(root, 3);
        root = createTree(root, 2);
        root = createTree(root, 4);
        root = createTree(root, 7);
        root = createTree(root, 6);
        root = createTree(root, 8);
        System.out.println(isCousin(root,2,4));
        System.out.println(isCousin(root,2,8));
        System.out.println(isCousin(root,5,4));
    }

    static class NodeInfo{
        int data;
        int parent;
        int level;

        public NodeInfo(int data, int parent, int level) {
            this.data = data;
            this.parent = parent;
            this.level = level;
        }
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

    public static boolean isCousin(Node root, int a, int b){
        if(root==null)
            return false;
        if(root.data==a || root.data==b || root.left.data==a || root.left.data==b ||
                root.right.data==a || root.right.data==b)
            return false;
        NodeInfo x = new NodeInfo(a, root.data, 1);
        NodeInfo y = new NodeInfo(b, root.data, 1);
        inorder(root, null, 1, x, y);
        if(x.level==y.level && x.parent!=y.parent)
            return true;
        else
            return false;
    }

    public static void inorder(Node root, Node parent, int level, NodeInfo x, NodeInfo y){
        if(root==null)
            return;
        inorder(root.left, root,level+1, x, y);
        if(root.data==x.data){
            x.parent = parent.data;
            x.level = level;
        }
        if(root.data==y.data){
            y.parent = parent.data;
            y.level = level;
        }
        inorder(root.right, root, level +1, x, y);
    }

}// class ends
