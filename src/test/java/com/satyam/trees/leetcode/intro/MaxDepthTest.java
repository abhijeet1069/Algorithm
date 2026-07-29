package com.satyam.trees.leetcode.intro;

import com.satyam.trees.leetcode.sample.TreeBuilder;
import com.satyam.trees.leetcode.sample.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxDepthTest {

    @Test
    void maxDepth() {
        Integer[] values = {3,9,20,null,null,15,7};
        TreeNode root = TreeBuilder.build(values);

        assertEquals(3, new MaxDepth().maxDepth(root));
    }
}