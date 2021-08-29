package com.arunscodes.DataStructures.BinaryTrees;


class Node{
        int key;
        Node left,right;

        public Node(int item){
            key = item;
            left = right = null;
        }

        }

public class BinaryTrees {

    Node root;

    BinaryTrees(){root = null;}

    void printPostOrder(Node node){
        if(node == null)
            return;

        printPostOrder(node.left);

        printPostOrder(node.right);

        System.out.print(node.key + "-- ");
    }


    void printPreOrder(Node node){
        if(node==null)
            return;

        System.out.print(node.key + "-- ");

        printPreOrder(node.left);

        printPreOrder(node.right);
    }

    void printInOrder(Node node){
        if(node==null)
            return;

        printInOrder(node.left);

        System.out.print(node.key +"--");

        printInOrder(node.right);
    }

    void printPostorder() { printPostOrder(root);}
    void printPreorder() { printPreOrder(root);}
    void printInorder() { printInOrder(root);}


    public static void main(String[] args) {

        BinaryTrees bt = new BinaryTrees();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);

        System.out.println(" PRE ORDER : ");
        //Function
        bt.printPreorder();

        System.out.println("\n IN ORDER : ");
        //Function
        bt.printInorder();

        System.out.println("\n POST ORDER : ");
        //Function
        bt.printPostorder();

    }

}
