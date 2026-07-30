package com.satyam.trees.theory.bst.traversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import com.satyam.trees.leetcode.sample.TreeNode;

public class Postorder {
	public List<Integer> postorderTraversal(TreeNode root) {
        //List<Integer> visited = new ArrayList<>();
        //recursivePostorder(root,visited);
        return iterativePostorder(root);
    }
	
	private void recursivePostorder(TreeNode root, List<Integer> visited) {
		if(root == null)
			return;
		
		recursivePostorder(root.left,visited);
		recursivePostorder(root.right,visited);
		visited.add(root.val);
	}
	
	private List<Integer> iterativePostorder(TreeNode root) {
        List<Integer> visited = new ArrayList<>();
        
        if(root == null)
        	return visited;
        
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
           TreeNode curr = stack.pop();
           visited.add(curr.val); 
           
           if (curr.left != null)
        	   stack.push(curr.left);
            
           if (curr.right != null)
        	   stack.push(curr.right);
        }
        Collections.reverse(visited);
        return visited;
    }
}
