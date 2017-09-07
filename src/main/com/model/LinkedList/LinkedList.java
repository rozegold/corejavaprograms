package com.model.LinkedList;

public class LinkedList {

    private Node head;
    private Node curr;
    private int length =0;

    public LinkedList(Node node){
        head = node;
        curr = head;
        length++;
    }

    public LinkedList(int data){
        head = new Node(data);

        curr= head;
        length++;
    }

    /**
     * This method will add a node at the end of the linked list.
     * @param data
     */
    public void add(final int data){
        if(curr==null){
            head = new Node(data);
            curr= head;
            length++;
            return;
        }
        Node node = new Node(data);
        curr.next = node;
        curr = node;
        length++;

    }

    public void addAt(final int data, final int pos){
        if(pos <= 0 || pos > length())
            return;

        Node newNode = new Node(data);
        Node next;
        Node curr=head;
        for (int i = 1; i < pos; i++) {
            curr= curr.next;

        }
        next= curr.next;
        curr.next = newNode;
        newNode.next = next;
        length++;
    }

    public Object getElement(int pos){
        return null;
    }

    public Object deleteElement(int pos){
        if(pos<=0 || pos>length)
            return null;
        Node toBeDeleted;
        Node next;
        Node curr=head;
        for (int i = 1; i < pos-1; i++) {
            curr= curr.next;
        }
        toBeDeleted=curr.next;
        next=toBeDeleted.next;
        curr.next = next;
         length--;
        return toBeDeleted.data;
    }

    public int length(){
        return length;
    }




}
