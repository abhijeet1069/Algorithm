package com.satyam.trees.theory.bst.traversal;

import com.satyam.trees.leetcode.sample.TreeBuilder;
import com.satyam.trees.leetcode.sample.TreeNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class InorderTraversalTest {

    @ParameterizedTest
    @MethodSource("testData")
    void testInorderTraversal(List<Integer> expected, Integer[] input) {
        TreeNode root = TreeBuilder.build(input);
        assertEquals(expected, new InorderTraversal().inorderTraversal(root));
    }

    static Stream<Arguments> testData(){
        return Stream.of(
                Arguments.of(
                        Arrays.asList(1,3,2),
                        (Object) new Integer[] {1,null,2,3}
                ),
                Arguments.of(
                        Arrays.asList(4,2,6,5,7,1,3,9,8),
                        (Object) new Integer[] {1,2,3,4,5,null,8,null,null,6,7,9}
                )
        );
    }
}