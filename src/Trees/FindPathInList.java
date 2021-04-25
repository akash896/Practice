package Trees;

import java.util.ArrayList;

public class FindPathInList {

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
        root1 = createTree(root1, 9);
        root1 = createTree(root1, 2);
        findPath(root1, 10);
    }

    public static void findPath(Node root, int v){

        ArrayList<Integer> path = new ArrayList<>();
        path = printPaths(root, path, 0, v);
        System.out.println(path);
    }

    private static ArrayList<Integer> printPaths(Node root, ArrayList<Integer> path, int index, int v) {
        if(root==null)
            return path;
        if(root.data == v){
            path.add(v);
            return path;
        }
        if(path.size()>index){
            path.remove(index);
            path.add(index, root.data);
        }
        else
            path.add(index, root.data);
        index++;
        if(root.left != null){
            path = printPaths(root.left, path, index, v);
            if(path.get(path.size()-1) == v)
                return path;
        }
        if(root.right != null){
            path = printPaths(root.right, path, index, v);
            if(path.get(path.size()-1) == v)
                return path;
        }
        return path;
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

