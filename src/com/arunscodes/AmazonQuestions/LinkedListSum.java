package com.arunscodes.AmazonQuestions;



public class LinkedListSum {
    Node head1, head2;

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }


    Node addLists(Node first, Node second) {
        Node res = null;
        Node prev = null;
        Node temp = null;
        int carry = 0, sum;

        Node revfirst = reverseList(first);
        Node revSecond = reverseList(second);

        while (revfirst!=null || revSecond!=null) {

            sum = carry + (revfirst != null ? revfirst.data : 0)
                    + (revSecond != null ? revSecond.data : 0);

            carry = (sum >= 10) ? 1 : 0;
            sum = sum % 10;
            temp = new Node(sum);

            if (res == null)
                res = temp;
            else
                prev.next = temp;

            prev = temp;

            if(revfirst != null){
                revfirst = revfirst.next;
            }
            if(revSecond != null){
                revSecond = revSecond.next;
            }

        }
        if(carry>0){
            temp.next = new Node(carry);
        }


        res = reverseList(res);
        return res;
    }

    Node reverseList(Node node) {
        Node current = node;
        Node next = null;
        Node prev = null;

        while (current!=null) {
            next = current.next;

            current.next = prev;
            prev = current;
            current = next;
        }
        if(next!=null)
            node.next = reverseList(next);

        return prev;
    }

    void printLists(Node head){
        while(head!=null){
            System.out.print(head.data +" ");
            head = head.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        LinkedListSum list = new LinkedListSum();
        list.head1 = new Node(7);
        list.head1.next = new Node(5);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = new Node(4);
        list.head1.next.next.next.next = new Node(6);

        System.out.print("First List is ");
        list.printLists(list.head1);

        list.head2 = new Node(8);
        list.head2.next = new Node(4);
        System.out.print("Second List is ");
        list.printLists(list.head2);

        Node rs = list.addLists(list.head1, list.head2);
        System.out.print("Resultant list : ");
        list.printLists(rs);

    }
}
