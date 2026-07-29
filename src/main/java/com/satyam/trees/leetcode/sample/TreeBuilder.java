package com.satyam.trees.leetcode.sample;

import java.util.LinkedList;
import java.util.Queue;

public class TreeBuilder {
    public static TreeNode build(Integer[] values){
        if(values == null || values.length == 0 || values[0] == null)
            return null;
        TreeNode root = new TreeNode(values[0]);

        Queue<TreeNode>  queue = new LinkedList<>();
        queue.offer(root);

        int index = 1;
        while (!queue.isEmpty() && index < values.length) {
            TreeNode current = queue.poll();

            // Left Child
            if (index < values.length && values[index] != null) {
                current.left = new TreeNode(values[index]);
                queue.offer(current.left);
            }
            index++;

            // Right Child
            if (index < values.length && values[index] != null) {
                current.right = new TreeNode(values[index]);
                queue.offer(current.right);
            }
            index++;
        }
        return root;
    }
}
