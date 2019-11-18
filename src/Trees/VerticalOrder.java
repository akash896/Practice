package Trees;
import java.util.*;

public class VerticalOrder {
    Node root;
    Map<Integer, ArrayList<Node>> map = new TreeMap<Integer, ArrayList<Node>>();
    public static void main(String[] args) {
        VerticalOrder t = new VerticalOrder();
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
        if(map.containsKey(d)){
            map.get(d).add(root);
        }
        else {
            ArrayList<Node> temp = new ArrayList<Node>();
            temp.add(root);
            map.put(d,temp);
        }
        topView(root.left, d-1);
        topView(root.right, d+1);
    }

    public void printView(){
        for (Integer key : map.keySet()) {
            List<Node> temp = new ArrayList<>();
            temp = map.get(key);
            for(int i=0 ; i<temp.size();i++){
                System.out.print(temp.get(i).data + "  ");
            }
        }
    }
//
//    public static void main(String[] args) {
//        Map<Integer, String> map = new TreeMap<>();
//        List<Integer> list = new ArrayList<>();
//        map.put(5, "5");
//        map.put(2, "5");
//        map.put(10, "5");
//        map.put(7, "5");
//        map.put(19, "5");
//        map.put(11, "5");
//        map.put(1, "5");
//
//
//        for (Integer key : map.keySet()) {
//            System.out.println(key);
//        }
//    }

}
