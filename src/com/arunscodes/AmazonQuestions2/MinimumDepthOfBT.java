package com.arunscodes.AmazonQuestions2;

public class MinimumDepthOfBT {

    Node2 root;

    int minDepth(Node2 root){
        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null)
            return 1;

        if(root.left == null)
            return minDepth(root.right) + 1;

        if(root.right == null)
            return minDepth(root.left) + 1;

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        MinimumDepthOfBT tree = new MinimumDepthOfBT();
        tree.root = new Node2(1);
        tree.root.left = new Node2(2);
        tree.root.right = new Node2(3);
        tree.root.left.left = new Node2(4);
        tree.root.left.right = new Node2(5);

        System.out.println(tree.minDepth(tree.root));
    }



}
class Node2{
    int data;
    Node2 left,right;
    public Node2(int item){
        data = item;
        left = right = null;
    }
}
