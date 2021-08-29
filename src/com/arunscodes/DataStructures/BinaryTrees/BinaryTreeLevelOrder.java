package com.arunscodes.DataStructures.BinaryTrees;


class Node2{
    int data;
    Node2 left, right;

    public Node2(int data){
        this.data = data;
        left = right = null;
    }
}
public class BinaryTreeLevelOrder {

    Node2 root;

    public BinaryTreeLevelOrder(){
        root = null;
    }

    void printLevelOrder(){
        int h = height(root);
        for(int i=1; i<=h;i++){
            printCurrentLevel(root,i);
        }

    }

    int height(Node2 root){
        if(root == null)
            return 0;
        else {
            int lheight = height(root.left);
            int rheight = height(root.right);

            if(lheight>rheight){
                return lheight+1;
            }else {
                return rheight+1;
            }

        }
    }

    void printCurrentLevel(Node2 root, int level){
        if(root==null)
            return;
        if(level==1)
            System.out.print(root.data + " ");
        else if (level>1){
            printCurrentLevel(root.left,level-1);
            printCurrentLevel(root.right,level-1);
        }
    }

    public static void main(String[] args) {

        BinaryTreeLevelOrder tree = new BinaryTreeLevelOrder();
        tree.root = new Node2(1);
        tree.root.left = new Node2(2);
        tree.root.right = new Node2(3);
        tree.root.left.left = new Node2(4);
        tree.root.left.right = new Node2(5);

        System.out.println(" LEVEL ORDER : ");

        tree.printLevelOrder();

    }

}
