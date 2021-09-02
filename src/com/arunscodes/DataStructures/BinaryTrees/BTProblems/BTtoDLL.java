package com.arunscodes.DataStructures.BinaryTrees.BTProblems;


class BTNode{
    int data;
    BTNode left, right;

    public BTNode(int data){
        this.data = data;
        right = left = null;
    }
}

public class BTtoDLL {
    BTNode root;
    BTNode head;

    void convertBTtoDLL(BTNode root){
        if(root==null)
            return;

        convertBTtoDLL(root.right);

        root.right = head;

        if(head!=null)
            head.left = root;

        head = root;

        convertBTtoDLL(root.left);

    }

    void printList(BTNode head){
        System.out.println(" Extracted List is : ");
        while (head!=null){
            System.out.print(head.data + "  ");
            head=head.right;
        }
    }


    public static void main(String[] args) {

        BTtoDLL tree = new BTtoDLL();
        tree.root = new BTNode(1);
        tree.root.left = new BTNode(2);
        tree.root.right = new BTNode(3);
        tree.root.left.left = new BTNode(4);
        tree.root.left.right = new BTNode(5);
        tree.root.right.left = new BTNode(6);
        tree.root.right.right = new BTNode(7);

        tree.convertBTtoDLL(tree.root);
        tree.printList(tree.head);


    }

}
