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



        node2.setLeft(node4);
        node2.setRight(node5);
        node1.setLeft(node2);
        node3.setRight(node7);
        node3.setLeft(node6);
        node1.setRight(node3);
        System.out.println("-----------Printing In order---------");
        RecursiveOrders main = new RecursiveOrders();
        main.inOrder(node1);
        System.out.println("-----------End Printing In order---------");

        System.out.println("-----------Printing Pre order---------");
        main.preOrder(node1);
        System.out.println("-----------End Printing Pre order---------");

        System.out.println("-----------Printing Post order---------");
        main.postOrder(node1);
        System.out.println("-----------End Printing Post order---------");




    }





}
