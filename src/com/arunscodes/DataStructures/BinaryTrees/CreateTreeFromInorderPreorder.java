package com.arunscodes.DataStructures.BinaryTrees;

class Tree{
    int val;
    Tree left;
    Tree right;

    Tree(int x){
        this.val = x;
    }
}
public class CreateTreeFromInorderPreorder {
    int preIndex=0;

    public Tree buildTree(int[] preorder, int[] inorder){
        return buildTreeHelper(preorder,inorder,0,inorder.length-1);
    }

    private Tree buildTreeHelper(int[] preorder, int[] inorder, int start, int end){
        if(start > end){
            return null;
        }

        int rootValue = preorder[preIndex++];
        Tree root = new Tree(rootValue);

        int inIndex = findIndex(inorder, start, end, rootValue);

        root.left = buildTreeHelper(preorder,inorder,start,inIndex-1);
        root.right = buildTreeHelper(preorder,inorder,inIndex+1,end);

        return root;
    }

    private int findIndex(int[] inorder, int start, int end, int value){
        for(int i = start; i<=end; i++){
            if(inorder[i]==value){
                return i;
            }
        }
        return -1;
    }
    public void printPostOrder(Tree root){
        if(root==null){
            System.out.println("null tree");
        }

        if(root.left!=null)
            printPostOrder(root.left);
        if (root.right!=null)
            printPostOrder(root.right);
        System.out.print(root.val+ "  ");


    }

    public static void main(String[] args) {
        CreateTreeFromInorderPreorder createTreeFromInorderPreorder = new CreateTreeFromInorderPreorder();

        int[] preOrder = {1,2,4,3,5,6};
        int[] inorder = {4,2,1,5,3,6};

//        Tree root = createTreeFromInorderPreorder.buildTreeHelper(preOrder,inorder,0,inorder.length-1);
        Tree root = createTreeFromInorderPreorder.buildTree(preOrder,inorder);

        createTreeFromInorderPreorder.printPostOrder(root);
    }
}
