package cci.ch2_linkedlist;

public class Q4_PartitionLL {

    /*
    *
    * Go through list
    *
    * */
    void partitionalLinkedList(Node head,int n){
        Node node = head;
        Node lsth_n= null;
        Node grth_n=null;
        Node temp_lsth_n=null;

        if (node.data>=n){
            grth_n=node;
        }else {
            temp_lsth_n=node;
        }
        node=node.next;

        while(node != null){

            if(node.data<n){
                if (temp_lsth_n == null){
                    temp_lsth_n=node;
                }else {

                }

            }
        }


    }
}
