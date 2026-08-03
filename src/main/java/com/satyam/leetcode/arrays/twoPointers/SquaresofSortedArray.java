package com.satyam.leetcode.arrays.twoPointers;

public class SquaresofSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];
        int l = 0, r = nums.length-1;
        int index = nums.length-1;
        while(l <= r){
            if(Math.abs(nums[l]) > Math.abs(nums[r])){
                squares[index] = nums[l]*nums[l];
                l++;
            }
            else{
                squares[index] = nums[r]*nums[r];
                r--;
            }
            index--;
        }
        return squares;
    }
}
