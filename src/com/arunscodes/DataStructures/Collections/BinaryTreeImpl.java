package com.arunscodes.DataStructures.Collections;


class BinaryTreeImpl {
   Node2 root;

   BinaryTreeImpl(int data){
       root = new Node2(data);
   }

   BinaryTreeImpl(){
       root=null;
   }

    public static void main(String[] args) {
//        BinaryTreeImpl btm = new BinaryTreeImpl();
//
//        btm.root=new Node2(1);
//
//        btm.root.left= new Node2(2);
//        btm.root.right = new Node2(3);
//
//        btm.root.left.left = new Node2(4);

        String ab = "abc";
        String str = ab;

        for(int i = 0 ; i<10 ; i++){
            str = str.concat(ab);
        }

        System.out.print(str);



   }





}

class Node2{
    int data;
    Node2 left, right;

    public Node2(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}