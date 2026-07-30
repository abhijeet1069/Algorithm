package com.satyam.trees.leetcode.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.satyam.trees.leetcode.sample.TreeNode;

/*
Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to
right, then right to left for the next level and alternate between).

			3
	9				20
			15				7

Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]
 * **/

public class BinTreeZigZagLevelOrder {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
		
        if(root == null)
        	return res;
   
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean dirLR = true; 
        while(!queue.isEmpty()) {
        	int size = queue.size();
            List<Integer> level = new ArrayList<>();
            
            for(int i = 0; i < size; i++) {
            	TreeNode curr = queue.poll();
            	if(dirLR)
            		level.add(curr.val);
            	else
            		level.add(0,curr.val);
      
            	if (curr.left != null)
                    queue.offer(curr.left);

                if (curr.right != null)
                    queue.offer(curr.right);
            }
            
            dirLR = !dirLR; //for each level keep changing direction
            res.add(level);
        }
        return res;
    }
}
