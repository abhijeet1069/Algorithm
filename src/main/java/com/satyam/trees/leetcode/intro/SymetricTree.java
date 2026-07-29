package com.satyam.trees.leetcode.intro;

import com.satyam.trees.leetcode.sample.TreeNode;

/**
 * Given the root of a binary tree, check whether it is a mirror of itself 
 * (i.e., symmetric around its center).
 * 
	  1
  2		  2
3	4   4   3

Input: root = [1,2,2,3,4,4,3]
Output: true
 * */
public class SymetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left,root.right);
    }

    private boolean isSymmetric(TreeNode l, TreeNode r){
        if(l == null && r == null )
            return true;

        if(l == null || r == null)
            return false;

        if(l.val != r.val)
            return false;

        return isSymmetric(l.left, r.right) &&
                isSymmetric(l.right, r.left);
    }
}
