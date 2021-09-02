package com.arunscodes.DataStructures.BinaryTrees.BTProblems;

class Node3{
    int data;
    Node3 left, right;

    public Node3(int data){
        this.data = data;
        left = right = null;
    }
}
public class BTViews {
    Node3 root;

    static  int max_level = 0;

    void leftViewUtil (Node3 node , int level){
        if(node==null)
            return;

        if(max_level<level){
            System.out.print(" " +node.data);
            max_level=level;
        }

        leftViewUtil(node.right, level+1);
        leftViewUtil(node.left, level+1);

    }

    void leftView(){
        leftViewUtil(root,1);
    }

    public static void main(String[] args) {

        BTViews tree = new BTViews();
        tree.root = new Node3(12);
        tree.root.left = new Node3(10);
        tree.root.right = new Node3(30);
        tree.root.right.left = new Node3(25);
        tree.root.right.right = new Node3(40);

        tree.leftView();
    }
}
