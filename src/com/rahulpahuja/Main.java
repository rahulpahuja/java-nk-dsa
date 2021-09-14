package com.rahulpahuja;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinaryTreeNode node1 = new BinaryTreeNode();
        node1.setData(1);

        BinaryTreeNode node2 = new BinaryTreeNode();
        node2.setData(2);

        BinaryTreeNode node3 = new BinaryTreeNode();
        node3.setData(3);

        BinaryTreeNode node4 = new BinaryTreeNode();
        node4.setData(4);

        BinaryTreeNode node5 = new BinaryTreeNode();
        node5.setData(5);

        BinaryTreeNode node6 = new BinaryTreeNode();
        node6.setData(6);

        BinaryTreeNode node7 = new BinaryTreeNode();
        node7.setData(7);



        node2.setLeft(node3);
        node2.setRight(node4);
        node1.setLeft(node2);
        node5.setLeft(node6);
        node5.setLeft(node7);
        node1.setRight(node5);
        System.out.println("-----------Printing In order---------");
        Main main = new Main();
        main.inOrder(node1);
        System.out.println("-----------End Printing In order---------");

    }

    public void inOrder(BinaryTreeNode root){
        if(root!=null){
            inOrder(root.getLeft());
            System.out.println(root.getData());
            inOrder(root.getRight());
        }else{
        //    System.out.println("Root is Null");
        }

    }
    public void preOrder(BinaryTreeNode root){
        if(root!=null)
        {
            System.out.println(root.getData());
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }else{
        System.out.println("Root is Null");
        }
    }
    public void postOrder(BinaryTreeNode root){
        if(root!=null){
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.println(root.getData());
        }else{
            System.out.println("Root is Null");
        }
    }


}
