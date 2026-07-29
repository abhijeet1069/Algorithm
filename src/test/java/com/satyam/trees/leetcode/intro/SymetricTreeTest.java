package com.satyam.trees.leetcode.intro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.satyam.trees.leetcode.sample.TreeBuilder;
import com.satyam.trees.leetcode.sample.TreeNode;

class SymetricTreeTest {

	@ParameterizedTest
    @MethodSource("testData")
    void isSymmetric(boolean expected, Integer[] values) {
        TreeNode root = TreeBuilder.build(values);
        
        assertEquals(expected,new SymetricTree().isSymmetric(root));
    }
    
    static Stream<Arguments> testData(){
        return Stream.of(
                Arguments.of(
                		true,
                		(Object) new Integer[] {1,2,2,3,4,4,3}
                ),
                Arguments.of(
                		false,
                		(Object) new Integer[] {1,2,2,null,3,null,3}
                		
                )
                
        );
    }
}