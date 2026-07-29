package com.satyam.trees.leetcode.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeBuilderTest {

    @Test
    void testBuild1() {
        Integer[] values = {10,5,15,3,8,12,20};
        TreeNode root = TreeBuilder.build(values);

        assertEquals(10, root.val);
    }

    @Test
    void testBuild2() {
        Integer[] values = {3,9,20,null,null,15,7};
        TreeNode root = TreeBuilder.build(values);

        assertEquals(3, root.val);
        assertEquals(7, root.right.right.val);
        assertEquals(15, root.right.left.val);
        assertEquals(9, root.left.val);
    }
}