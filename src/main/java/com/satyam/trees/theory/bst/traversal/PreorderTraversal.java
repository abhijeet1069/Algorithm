package com.satyam.trees.theory.bst.traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.satyam.trees.leetcode.sample.TreeNode;

public class PreorderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) {
		// List<Integer> visited = new ArrayList<>();
		// recursivePreOrder(root,visited);
		return iterativePreorder(root);
	}

	private void recursivePreOrder(TreeNode root, List<Integer> visited) {
		if (root == null)
			return;

		visited.add(root.val);
		recursivePreOrder(root.left, visited);
		recursivePreOrder(root.right, visited);
	}

	private List<Integer> iterativePreorder(TreeNode root) {
        List<Integer> visited = new ArrayList<>();
        
        if(root == null)
        	return visited;
        
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
           TreeNode curr = stack.pop();
           visited.add(curr.val);
           if (curr.right != null)
        	   stack.push(curr.right);
            
           if (curr.left != null)
        	   stack.push(curr.left);
        }
        return visited;
    }
}
