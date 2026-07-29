package com.satyam.trees.leetcode.intro;

import com.satyam.trees.leetcode.sample.TreeNode;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
