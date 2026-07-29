package com.satyam.trees.theory.bst.traversal;

import com.satyam.trees.leetcode.sample.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        //List<Integer> visited = new ArrayList<>();
        //recursiveInorder(root,visited);
        return iterativeInorder(root);
    }

    private void recursiveInorder(TreeNode root, List<Integer> visited){
        if(root == null)
            return;
        recursiveInorder(root.left,visited);
        visited.add(root.val);
        recursiveInorder(root.right,visited);
    }

    private List<Integer> iterativeInorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> visited = new ArrayList<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) { //for inorder visit left subtree first
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            visited.add(curr.val);
            curr = curr.right;
        }
        return visited;
    }
}
