package cci.ch2_linkedlist;

public class LinkedList {
    Node head=null;
    Node tail=null;

    void append(int data){
        Node n = new Node(data);
        if (head==null){
            head=tail=n;
        }else {
            tail.next=n;
        }
    }

    void appendAtBegning(int data){
        Node n = new Node(data);
        if (head==null){
            head=tail=n;
        }else {
            n.next=head;
            head=n;
        }
    }

    void removeNode(){

    }
}

class Node {
    Node next=null;
    Node prev=null;

    int data;

    Node(int data){
        this.data=data;
    }
}
