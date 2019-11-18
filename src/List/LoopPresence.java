package List;

import java.util.LinkedList;
import java.util.List;

public class LoopPresence {

    static class Node {
        int data;
        Node next;

        public Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node head1 = new Node(1);
        Node head2 = new Node(2);
        Node head3 = new Node(3);
        Node head4 = new Node(4);
        Node head5 = new Node(5);
        Node head6 = new Node(6);
        Node head7 = new Node(7);
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head7;
        //head7.next = head4;
        //display(head1);
        System.out.println(findloop(head1));
    }

    public static int findloop(Node head){
        boolean loop = false;
        Node fast = head;
        Node slow = head;
        while(fast!=null || slow !=null){
            if(fast.next==null || fast.next.next==null)
                break;
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                loop = true;
                break;
            }
        }
        if(loop){
            slow = head;
            while(slow!=fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow.data;
        }
        else{
            System.out.println("No loops ");
            return -1;
        }
    }

    public static void display(Node head){
        Node ptr = head;
        while(ptr!=null) {
            System.out.println(ptr.data + "--> ");
            ptr = ptr.next;
        }
    }
}
