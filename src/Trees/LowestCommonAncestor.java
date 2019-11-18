package Trees;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {
    Node root;
    public LowestCommonAncestor(){
        root = null;
    }
    public static void main(String[] args) {

        LowestCommonAncestor t = new LowestCommonAncestor();
        List<Integer> A = new ArrayList<Integer>();
        //A.add(3);        A.add(6);        A.add(8);        A.add(2);        A.add(11);        A.add(0);
        //A.add(13);        A.add(0);        A.add(0);        A.add(9);        A.add(5);        A.add(7);
        t.root = t.createTree(t.root, 4);
        t.root = t.createTree(t.root, 2);
        t.root = t.createTree(t.root, 1);
        t.root = t.createTree(t.root, 3);
        t.root = t.createTree(t.root, 6);
        t.root = t.createTree(t.root, 5);
        t.root = t.createTree(t.root, 7);
        t.root = t.createTree(t.root, 8);
        Node k = t.finndancestor(t.root, 2, 5);
        if(k!=null)
        System.out.println("answer is " + k.data);
    }

    public Node createTree(Node root, int key){
        if(root == null)
            return new Node(key);
        else{
            if(key <= root.data)
                root.left = createTree(root.left, key);
            else
                root.right = createTree(root.right, key);
        }
        return root;
    }

        Node finndancestor(Node root, int n1, int n2) {
        if(root == null)
            return null;
        if(root.data ==n1 || root.data == n2)
            return root;
        Node lp = finndancestor(root.left, n1, n2);
        Node rp = finndancestor(root.right, n1, n2);
            if(lp == null && rp == null)
                return null;
            if(lp!=null && rp!=null)
                return root;
            if(lp==null)
                return rp;
            else
                return lp;
        }
}// class ends
