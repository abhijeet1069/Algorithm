package com.satyam.trees.leetcode.intro;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.satyam.trees.leetcode.sample.TreeBuilder;
import com.satyam.trees.leetcode.sample.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BalancedBinaryTreeTest {

	@ParameterizedTest
    @MethodSource("testData")
	void testIsBalanced(boolean expected, Integer[] values) {
		TreeNode root = TreeBuilder.build(values);
		assertEquals(expected,new BalancedBinaryTree().isBalanced(root));
	}
	
	static Stream<Arguments> testData(){
        return Stream.of(
                Arguments.of(
                		true,
                		(Object) new Integer[] {3,9,20,null,null,15,7}
                ),
                Arguments.of(
                		false,
                		(Object) new Integer[] {1,2,2,3,3,null,null,4,4}	
                ),
                Arguments.of(
                		true,
                		(Object) new Integer[] {}
                ),
                Arguments.of(
                		false,
                		(Object) new Integer[] {1,2,2,3,null,null,3,4,null,null,4}	
                )
                
        );
    }

}
