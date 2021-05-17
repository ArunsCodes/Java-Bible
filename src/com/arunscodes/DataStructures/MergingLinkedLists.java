package com.arunscodes.DataStructures;

class Node {
    int data;
    Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
}

class  MergingLinkedLists{
    Node head;

    public void addToLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergingLinkedLists linkedLists1 = new MergingLinkedLists();
        MergingLinkedLists linkedLists2 = new MergingLinkedLists();

        linkedLists1.addToLast(new Node(2));
        linkedLists1.addToLast(new Node(5));
        linkedLists1.addToLast(new Node(6));

        linkedLists2.addToLast(new Node(3));
        linkedLists2.addToLast(new Node(7));
        linkedLists2.addToLast(new Node(10));

        linkedLists1.head = new newMerge().mergeLists(linkedLists1.head,linkedLists2.head);

        linkedLists1.printList();
    }
}

class newMerge
{

    Node mergeLists(Node a, Node b){

        Node dummy = new Node(0);
        Node tail = dummy;

        while(true){

            if(a==null){
                tail.next=b;
                break;
            }
            if(b==null){
                tail.next=a;
                break;
            }

            if(a.data <= b.data){
                tail.next=a;
                a=a.next;
            }
            else {
                tail.next=b;
                b=b.next;
            }

            tail=tail.next;
        }
        return dummy.next;
    }
}
