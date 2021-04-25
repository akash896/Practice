package Trees;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RightView {
static Map<Integer, Node> map = new TreeMap<>();
    public static void main(String[] args) {
        Node root = null;
        root = createTree(root, 5);
        root = createTree(root, 3);
        root = createTree(root, 2);
        root = createTree(root, 4);
        root = createTree(root, 1);
        root = createTree(root, 6);
        rightView(root,1);
        display();
    }// main ends

    public static Node createTree(Node root, int d){
        if(root == null){
            root = new Node(d);
            return root;
        } 
        if(d < root.data)
            root.left = createTree(root.left, d);
        else
            root.right = createTree(root.right, d);
        return root;
    }

    public static void rightView(Node root, int h){
            if(root == null)
                return;
            if(!map.containsKey(h))
                map.put(h, root);
            if(root.right!=null)
            rightView(root.right, h+1);
        if(root.left!=null)
            rightView(root.left, h+1);

    }

    public static void display(){
        for(Integer i : map.keySet()){
            System.out.println(map.get(i).data + " ");
        }
    }
}// class ends
