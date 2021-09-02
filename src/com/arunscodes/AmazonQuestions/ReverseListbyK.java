package com.arunscodes.AmazonQuestions;

class ReverseListbyK{
    Node head;

    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    Node reverse(Node head, int k){
        if (head == null)
            return null;

        Node current = head;
        Node next = null;
        Node prev = null;

        int count = 0 ;

        while(count<k && current!=null){
            next = current.next;

            current.next = prev;
            prev = current;
            current = next;

            count++;
        }

        if(next!=null)
            head.next = reverse(next, k);

        return prev;

    }

    void push(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        ReverseListbyK list = new ReverseListbyK();

        list.push(9);
        list.push(8);
        list.push(7);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        System.out.println("Given list = ");
        list.printList();

        list.head = list.reverse(list.head, 3);

        System.out.println("Reversed list");
        list.printList();
    }
}