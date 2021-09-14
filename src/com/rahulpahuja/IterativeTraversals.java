package com.rahulpahuja;

import java.util.ArrayList;
import java.util.Stack;

public class IterativeTraversals {
    public ArrayList<Integer> preorderTraversal(BinaryTreeNode root){

        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root==null)return res;
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()){
            BinaryTreeNode tmp = s.pop();
            res.add(tmp.data);
            if(tmp.right!=null)
                s.push(tmp.right);
            if(tmp.left!=null)
                s.push(tmp.left);
        }
        return res;
    }
 }
