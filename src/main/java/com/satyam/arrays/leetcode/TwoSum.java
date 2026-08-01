package com.satyam.arrays.leetcode;

import java.util.HashMap;

/**
1. Two Sum

You are given an array of integers nums and an integer target, return indices of the two numbers such 
that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element 
twice.

You can return the answer in any order.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]

My earlier solution was a loop to include all elements in HashMap.
Then performed the lookup. But below solution is more optimized. Its adding the keys
doing the lookup for previous inserted keys and thus preventing same index lookup in a single loop.
 * */

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];

            if (map.containsKey(x)) {
                return new int[]{map.get(x), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
