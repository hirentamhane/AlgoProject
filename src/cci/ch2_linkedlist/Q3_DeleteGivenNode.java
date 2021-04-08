package cci.ch2_linkedlist;

public class Q3_DeleteGivenNode {

    boolean deleteGivenNode(Node n){

        if(n.next!=null) {
            n.data = n.next.data;
            n.next = n.next.next;
            return true;
        }
        return false;
    }
}
