package Trees;
import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
public class TreeLevelOrder {
    Node root;
    public static void main(String args[]){
    TreeLevelOrder t = new TreeLevelOrder();
    t.root = null;
    t.root = t.insertBST(t.root, 4);
    t.root = t.insertBST(t.root, 2);
    t.root = t.insertBST(t.root, 1);
    t.root = t.insertBST(t.root, 3);
    t.root = t.insertBST(t.root, 6);
    t.root = t.insertBST(t.root, 5);
    t.root = t.insertBST(t.root, 7);
    t.root = t.insertBST(t.root, 8);
        System.out.println("LEVEL  ORDER 1 IS ");
    t.levelOrderProcess1(t.root);
        System.out.println("LEVEL  ORDER 2 IS ");
    t.levelOrderProcess2(t.root);
        System.out.println("\nHeight = " + t.height(t.root) );
}

public Node insertBST(Node root, int key){
        if(root == null)
            return new Node(key);
        else{
            if(key <= root.data)
                root.left = insertBST(root.left , key);
            else
                root.right = insertBST(root.right, key);
        }
        return root;
}

public void levelOrderProcess1(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node n = q.remove();
            System.out.print(n.data + " ");
            if(n.left!=null)
            q.add(n.left);
            if(n.right!=null)
            q.add(n.right);
        }
    System.out.println();
}

public void levelOrderProcess2(Node root){
        int h = height(root);
        for(int i=1 ; i<=h ; i++)
            printLevel(root, i);
}

public int height(Node root){
        if(root==null)
            return 0;
        else
            if(root.left==null && root.right==null)
                return 1;
        else
            return 1 + max( height(root.left), height(root.right));
}

public int max(int a, int b){
        return (a>b)? a:b;
}

public void printLevel(Node root, int level){
        if(level == 1 && root!=null) {
            System.out.print(root.data+" ");
            return;
        }
        else {
            if(root.left!=null)
            printLevel(root.left, level - 1);
            if(root.right!=null)
            printLevel(root.right, level - 1);
        }
}
}


