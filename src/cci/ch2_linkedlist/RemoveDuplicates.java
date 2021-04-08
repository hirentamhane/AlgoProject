package cci.ch2_linkedlist;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicates {

    void removeDuplicates(Node head){
        HashSet<Integer> dataPresenceMap = new HashSet<>();
        Node n= head;
        Node p=null;
        while(n.next != null){
            if (dataPresenceMap.contains(n.data)){
                   p.next=n.next;
            }else {
                dataPresenceMap.add(n.data);
                p=n;
            }
            n=n.next;
        }
    }
}
