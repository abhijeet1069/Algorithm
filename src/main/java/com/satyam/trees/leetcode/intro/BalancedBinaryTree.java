package com.satyam.trees.leetcode.intro;

import com.satyam.trees.leetcode.sample.TreeNode;

/**
 * 
Given a binary tree, determine if it is height-balanced.

A height-balanced binary tree is a binary tree in which the 
depth of the two subtrees of every node never differs by more than one.
 * */
public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
	    return height(root) != -1;
	}

	private int height(TreeNode node) {
	    if (node == null)
	        return 0;

	    int left = height(node.left);
	    if (left == -1)
	        return -1;

	    int right = height(node.right);
	    if (right == -1)
	        return -1;

	    if (Math.abs(left - right) > 1)
	        return -1;

	    return Math.max(left, right) + 1;
	}
}
