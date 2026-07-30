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

class PostorderTraversalTest {

	@ParameterizedTest
    @MethodSource("testData")
    void testPostorderTraversal(List<Integer> expected, Integer[] input) {
        TreeNode root = TreeBuilder.build(input);
        assertEquals(expected, new Postorder().postorderTraversal(root));
    }
	
	private static Stream<Arguments> testData(){
        return Stream.of(
                Arguments.of(
                        Arrays.asList(3,2,1),
                        (Object) new Integer[] {1,null,2,3}
                ),
                Arguments.of(
                        Arrays.asList(4,6,7,5,2,9,8,3,1),
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
