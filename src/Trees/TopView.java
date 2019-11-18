package Trees;
import java.util.*;

public class TopView {
    Node root;
    Map<Integer, Node> map = new TreeMap<Integer, Node>();
    public static void main(String[] args) {
        TopView t = new TopView();
        t.root = null;
        t.root = t.insertBST(t.root, 4);
        t.root = t.insertBST(t.root, 2);
        t.root = t.insertBST(t.root, 1);
        t.root = t.insertBST(t.root, 3);
        t.root = t.insertBST(t.root, 6);
        t.root = t.insertBST(t.root, 5);
        t.root = t.insertBST(t.root, 7);
        t.root = t.insertBST(t.root, 8);
        t.topView(t.root, 0);
        t.printView();
    }

    public Node insertBST(Node root, int key){
        if(root == null)
            return new Node(key);
        else{
            if(key <= root.data)
                root.left = insertBST(root.left, key);
            else
                root.right = insertBST(root.right, key);
        }
        return root;
    }

    public void topView(Node root, int d){
        if(root == null)
            return;
        if(!map.containsKey(d))
        map.put(d,root);
        topView(root.left, d-1);
        topView(root.right, d+1);
    }

    public void printView(){
        for (Integer key : map.keySet()) {
                System.out.println(key + "-->" + map.get(key).data + " , ");
            }
        }
    }


