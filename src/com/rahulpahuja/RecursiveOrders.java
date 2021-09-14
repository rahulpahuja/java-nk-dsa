package com.rahulpahuja;

public class RecursiveOrders {
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
            //System.out.println("Root is Null");
        }
    }
    public void postOrder(BinaryTreeNode root){
        if(root!=null){
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.println(root.getData());
        }else{
            //System.out.println("Root is Null");
        }
    }
}
