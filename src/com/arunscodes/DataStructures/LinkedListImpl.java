package com.arunscodes.DataStructures;

public class LinkedListImpl {
    static Node head; // Head of the linked list.

    static class Node{
        int data;
        Node next;

        //Constructor.
        Node(int d){
            data=d;
            next=null;
        }
    }

    public static void printList(){
        Node n = head;

        while(n!=null){
            System.out.print(n.data +" -> ");
            n=n.next;
        }
    }


    public static void addNodeAtFront(Node n, LinkedListImpl linkedList){
        Node tempNode = linkedList.head;
        linkedList.head = n;
        n.next = tempNode;

        System.out.println("\n Rearranged List = ");
        printList();

    }

    public static void addAtGivenPoint(Node prevNode, int value){
        Node newNode = new Node(value);
        newNode.next = prevNode.next;
        prevNode.next = newNode;

        System.out.println("\n New List now : ");
        printList();
    }

    public static void addAtEnd(int value, LinkedListImpl linkedList){
        Node newNode = new Node(value);
        Node last = linkedList.head;
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=newNode;

        System.out.println("\n New List : ");
        printList();

    }

    static void deleteNode(int key)
    {   Node temp;
        Node prev = head;


        if( head.data==key && head.next!=null){
            temp = head;
            head = head.next;

            System.out.println("\n Removed from List head: ");
            printList();

            return;
        }

        while( prev.next.data!= key){
            prev = prev.next;
        }

        prev.next = prev.next.next;
        printList();

    }

    static void findLength(){
        Node temp = head;
        int count=1;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }

        System.out.println("\n Count = " +count);
    }

    public static void main(String[] args) {
        LinkedListImpl llist = new LinkedListImpl();

        llist.head = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);

        llist.head.next = two;
        two.next=three;

        System.out.println("Initial List: ");
        printList();

        Node four = new Node(4);
        addNodeAtFront(four,llist);
        addAtGivenPoint(two,5);

        addAtEnd(25,llist);

        deleteNode(5);

        deleteNode(4);

        findLength();


    }
}
