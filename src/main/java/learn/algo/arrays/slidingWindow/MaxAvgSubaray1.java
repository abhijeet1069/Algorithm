package learn.algo.arrays.slidingWindow;

/**
 * calculate inital window length, and store in currSum
 * int maxSum = currSum
 * for(l = 1, r = k; l < nums.length && r < nums.length; l++,r++){
 *     currSum = currSum+nums[r]-nums[l-1] //window shifts to right
 *     if(maxSum < currSum)
 *      maxSum = currSum
 * }
 * return maxSum/k
 * */

public class MaxAvgSubaray1 {
    public double findMaxAverage(int[] nums, int k) {
        int currSum = 0;
        //calculate inital window sum
        for(int i = 0; i < k; i++)
            currSum += nums[i];
        int maxSum = currSum;
        //better loop
        for(int i=k;i<nums.length;i++) {
            currSum -= nums[i-k];
            currSum += nums[i];
            maxSum = Math.max(maxSum,currSum);

        }
        return (double)maxSum/k;
    }
}
