package com.satyam.trees.leetcode.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.satyam.trees.leetcode.sample.TreeNode;

/*
Given the root of a binary tree, return the level order traversal of its nodes' values. 
(i.e., from left to right, level by level).

			3
	9				20
			15				7

Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
 * **/

public class BinTreeLevelOrder {
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
		
        if(root == null)
        	return res;
		
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()) {
        	int size = queue.size();
            List<Integer> level = new ArrayList<>();
            
            for(int i = 0; i < size; i++) {
            	TreeNode curr = queue.poll();
            	level.add(curr.val);
            	
            	if (curr.left != null)
                    queue.offer(curr.left);

                if (curr.right != null)
                    queue.offer(curr.right);
            }
            res.add(level);
        }
        return res;
    }
}
