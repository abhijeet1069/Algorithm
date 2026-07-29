package com.satyam.trees.leetcode.intro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.satyam.trees.leetcode.sample.TreeBuilder;
import com.satyam.trees.leetcode.sample.TreeNode;

class MinDepthTest {

	@Test
	void testMinDepth() {
		Integer[] values = {2,null,3,null,4,null,5,null,6};
        TreeNode root = TreeBuilder.build(values);
        
        assertEquals(5, new MinDepth().minDepth(root));
	}

}
