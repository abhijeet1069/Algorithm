package com.satyam.leetcode.arrays.fundamentals;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int[] lsum = new int[nums.length];
        int[] rsum = new int[nums.length];

        // compute left sum
        for(int i = 1; i < nums.length; i++)
            lsum[i] = lsum[i-1]+nums[i-1];

        //compute right sum
        for(int i = nums.length-2;  i >= 0; i--)
            rsum[i] = rsum[i+1]+nums[i+1];

        //check index where both are equal else return -1
        int index = -1;
        for(int i = 0; i < nums.length; i++){
            if(lsum[i] == rsum[i]){
                index = i;
                break;
            }
        }
        return index;
    }
}
