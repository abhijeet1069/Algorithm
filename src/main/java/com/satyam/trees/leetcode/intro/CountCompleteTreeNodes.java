package com.satyam.trees.leetcode.intro;

import com.satyam.trees.leetcode.sample.TreeNode;


/***
 * Given the root of a complete binary tree, return the number of 
 * the nodes in the tree.

According to Wikipedia, every level, except possibly the last, 
is completely filled in a complete binary tree, and all nodes in 
the last level are as far left as possible. It can have between 
1 and 2^h nodes inclusive at the last level h.

Design an algorithm that runs in less than O(n) time complexity.

Input: root = [1,2,3,4,5,6]
Output: 6
		1
   2			3
4	   5	6

 * 
 */
public class CountCompleteTreeNodes {
	public int countNodes(TreeNode root) {

        if (root == null)
            return 0;

        int leftHeight = leftHeight(root.left);
        int rightHeight = leftHeight(root.right);

        // Left subtree is a perfect binary tree
        // 2^leftHeight
        if (leftHeight == rightHeight) {
            return (1 << leftHeight) + countNodes(root.right);
        }

        // Right subtree is a perfect binary tree
        return (1 << rightHeight) + countNodes(root.left);
    }

    private int leftHeight(TreeNode node) {

        int height = 0;

        while (node != null) {
            height++;
            node = node.left;
        }

        return height;
    }
}
