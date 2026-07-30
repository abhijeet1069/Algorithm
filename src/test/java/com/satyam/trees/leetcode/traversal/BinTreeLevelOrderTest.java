package com.satyam.trees.leetcode.traversal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.satyam.trees.leetcode.sample.TreeBuilder;
import com.satyam.trees.leetcode.sample.TreeNode;

class BinTreeLevelOrderTest {

	@ParameterizedTest
    @MethodSource("testData")
    void testInorderTraversal(List<Integer> expected, Integer[] input) {
        TreeNode root = TreeBuilder.build(input);
        assertEquals(expected, new BinTreeLevelOrder().levelOrder(root));
    }
	
	private static Stream<Arguments> testData(){
        return Stream.of(
                Arguments.of(
                		Arrays.asList(Arrays.asList(3),Arrays.asList(9,20),Arrays.asList(15,7)),
                        (Object) new Integer[] {3,9,20,null,null,15,7}
                ),
                Arguments.of(
                		Arrays.asList(Arrays.asList(1)),
                        (Object) new Integer[] {1}
                )
        );
    }

}
