package com.arunscodes.DataStructures.BinaryTrees.BTProblems;


//This is the Lowest Common Ancestor for a tree.

class LCANode{
    int data;
    LCANode left, right;

    public LCANode(int data){
        this.data = data;
        left = right = null;
    }
}

public class LCATree {

    LCANode root;

    LCANode findLCA (int n1, int n2){
        return findLCA(root, n1,n2);
    }

    LCANode findLCA(LCANode node, int n1, int n2){
        if(node == null){
            return null;
        }

        if(node.data == n1 || node.data == n2)
            return node;

        LCANode left_lca = findLCA(node.left, n1, n2);
        LCANode right_lca = findLCA(node.right, n1, n2);

        if(left_lca!=null && right_lca!=null)
            return node;

        return (left_lca!=null)?left_lca:right_lca;

    }


    public static void main(String[] args) {

        LCATree tree = new LCATree();
        tree.root = new LCANode(1);
        tree.root.left = new LCANode(2);
        tree.root.right = new LCANode(3);
        tree.root.left.right = new LCANode(5);
        tree.root.left.left = new LCANode(4);
        tree.root.right.left = new LCANode(6);
        tree.root.right.right = new LCANode(7);

        System.out.println(" LCA (4,5) " + tree.findLCA(4,5).data);
        System.out.println(" LCA (5,6) " + tree.findLCA(5,6).data);
        System.out.println(" LCA (3,4) " + tree.findLCA(3,4).data);
        System.out.println(" LCA (2,4) " + tree.findLCA(2,4).data);

    }

}
