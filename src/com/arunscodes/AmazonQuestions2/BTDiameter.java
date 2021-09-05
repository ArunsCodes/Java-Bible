package com.arunscodes.AmazonQuestions2;

public class BTDiameter {

    //Diameter of a Binary Tree will be either
    // Max( Height of Left tree + Height of right tree +1 / Left diameter / Right diameter ),
    Node root;

    int diameter (Node root){
        if(root==null)
            return 0;

        int lheight = height(root.left);
        int rheight = height(root.right);

        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);

        return Math.max(lheight+rheight+1, Math.max(
                ldiameter,rdiameter));
    }

    int height(Node node){
        if(node==null)
            return 0;

        return (1 + Math.max(height(node.left), height(node.right)));
    }

    public static void main(String[] args) {
        BTDiameter bt = new BTDiameter();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);

        System.out.println(" Diameter : " +bt.diameter(bt.root));
    }

}

class Node{
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
        left = right = null;
    }
}