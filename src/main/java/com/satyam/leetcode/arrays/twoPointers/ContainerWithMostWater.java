package com.satyam.leetcode.arrays.twoPointers;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0, r = height.length-1, max_area = -1, curr_area = 0;
        while(l < r){
            if(height[l] <= height[r]){
                curr_area = (r-l)*height[l];
                l++;
            }
            else{
                curr_area = (r-l)*height[r];
                r--;
            }
            if(max_area < curr_area)
                max_area = curr_area;
        }
        return max_area;
    }
}
