package com.satyam.trees.leetcode.intro;

import com.satyam.trees.leetcode.sample.TreeNode;

/**
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path 
from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.
	2
	  3
	    4
	      5
	      	6
Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5

Thought its similar to max depth but no.
 * */

public class MinDepth {
	public int minDepth(TreeNode root) {
		if(root == null)
            return 0;
		
		if(root.left == null && root.right == null)
			return 1;
		
		if(root.left == null)
			return minDepth(root.right)+1;
		
		if(root.right == null)
			return minDepth(root.left)+1;
		
        return 1+Math.min(minDepth(root.left),minDepth(root.right));
    }
}
