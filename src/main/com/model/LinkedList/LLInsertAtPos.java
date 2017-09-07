package com.model.LinkedList;

public class LLInsertAtPos {


    public static void main(String[] args) {
        Node head = InsertNth(null,3,0);
InsertNth(head,5,1);
InsertNth(head,4,2);
InsertNth(head,2,3);
InsertNth(head,10,1);

        printLL(head);
    }

    private static void printLL(Node head) {
        if(null==head){
            return;
        }
        do{
            System.out.println(head.data);
            head=head.next;
        }while(head != null);
    }
    /*
  Insert Node at a given position in a linked list
  head can be NULL
  First element in the linked list is at position 0
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/


    static Node InsertNth(Node head, int data, int position) {
        // This is a "method-only" submission.
        // You only need to complete this method.

        Node node = new Node(data);

        if(head==null){
            return node;
        }

        if(position < 0 ){
            return head;
        }
        Node curr = head;
        for(int i=0;i<position-1;i++){
            curr= curr.next;
        }
        Node nextNode = curr.next;

        curr.next = node;
        node.next=nextNode;

        return head;



    }

}
