package com.satyam.trees.theory.bst.traversal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.satyam.trees.leetcode.sample.TreeBuilder;
import com.satyam.trees.leetcode.sample.TreeNode;

class PreorderTraversalTest {

	@ParameterizedTest
    @MethodSource("testData")
    void testPreorderTraversal(List<Integer> expected, Integer[] input) {
        TreeNode root = TreeBuilder.build(input);
        assertEquals(expected, new PreorderTraversal().preorderTraversal(root));
    }
	
	private static Stream<Arguments> testData(){
        return Stream.of(
                Arguments.of(
                        Arrays.asList(1,2,3),
                        (Object) new Integer[] {1,null,2,3}
                ),
                Arguments.of(
                        Arrays.asList(1,2,4,5,6,7,3,8,9),
                        (Object) new Integer[] {1,2,3,4,5,null,8,null,null,6,7,9}
                ),
                Arguments.of(
                        Arrays.asList(),
                        (Object) new Integer[] {}
                ),
                Arguments.of(
                        Arrays.asList(1),
                        (Object) new Integer[] {1}
                )
                
        );
    }

}
