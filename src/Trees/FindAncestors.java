package Trees;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

// problem is to find ancestors of a given Node of a binary tree
public class FindAncestors {

    public static void main(String[] args) {
        int A[] = new int[]{5, 3, 2, 4, 1, 6, 7, 8, 9};
        Node root = null;
        for (int i = 0; i < A.length; i++) {
            root = createTree(root, A[i]);
        }
        findAncestors(root, 8);
    }

    public static void findAncestors(Node root, int val){
        if(root==null)
            return;

        int A[] = new int[10];
        findAncestors(root, A, 0, val);
    }

    public static void findAncestors(Node root, int A[], int index, int val){
        if(root!=null)
            A[index++] = root.data;
        if(root.data==val) {
            for(int i=0;i<index-1;i++)
                System.out.print(A[i] + " ");
        }
        if(root.left!=null)
        findAncestors(root.left, A, index, val);
        if(root.right!=null)
        findAncestors(root.right, A, index, val);
    }

    public static Node createTree(Node root, int d){
        if(root == null)
            return new Node(d);
        if(d < root.data)
            root.left = createTree(root.left , d);
        else
            root.right = createTree(root.right, d);
        return root;
    }

}
