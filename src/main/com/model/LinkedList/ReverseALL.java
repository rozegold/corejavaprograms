package com.model.LinkedList;

public class ReverseALL {


    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        printreverse(head);
        System.out.println();
        printLL(head);
        printLL(Reverse(head));
    }

    private static void printLL(Node head) {
        if(null==head){
            return;
        }
        do{
            System.out.print(head.data);
            System.out.print(" ");
            head=head.next;
        }while(head != null);
        System.out.println();
    }

    static void printreverse(Node head){

        if(head == null){
            return;
        }
        printreverse(head.next);
        System.out.print(head.data+" ");


    }


    static Node Reverse(Node head) {

        if(null == head || head.next == null)
            return head;

        Node prev,next,curr;
        prev = null;
        curr = head;
        next = curr.next;
        do{
            curr.next = prev;

            prev = curr;
            curr = next;
            if(next != null)
            next = next.next;

        }while(curr != null );

        return prev;



    }
}
