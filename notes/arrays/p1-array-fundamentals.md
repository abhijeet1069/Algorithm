# Phase 1: Array Fundamentals

## Two Sum

You are given an array of integers and an integer target, return indices of two numbers that add up to target.
Don't use the same element twice.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

```java
public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];

            // this is an optimized use of hashmap, we could had input all elements in it and then traversed
            // but such use also removes duplicates, as hashmap only contains the last elements
            if (map.containsKey(x)) {
                return new int[]{map.get(x), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{};
    }
```

## Two Sum for sorted array

Given a 1-indexed array of integers, sorted in ascending order, find two numbers adding up to target.

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

```java
public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int l = 0, r = numbers.length-1;
        while(l < r){
            int temp = numbers[l]+numbers[r];
            if(temp == target){
                res[0] = l+1;
                res[1] = r+1;
                return res;
            }
            else if(temp > target)
                r--;
            else
                l++;
        }
        return res;
    }
```

##  Remove Duplicates from Sorted Array

Given a sorted array in increasing order, remove duplicates in place.

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3,
and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

```java
public int removeDuplicates(int[] nums) {
  int index = 1;
  for(int i = 1;i < nums.length; i++){
    if(nums[i] != nums[index]){ //Don't focus on duplicates but on unique items
      index++;
      nums[index] = nums[i]; //duplicates automatically over-ridden
    }
  }
  return index;
}
```

## Merge Sorted Array

Merge two sorted arrays into a single array sorted in increasing order.

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]

```java
public void merge(int[] nums1, int m, int[] nums2, int n) {
    // m is nums1 length and n is nums2 length
        int[] res = new int[m+n];
        int index = 0, i = 0, j = 0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                res[index] = nums1[i];
                i++;
            }
            else{
                res[index] = nums2[j];
                j++;
            }
            index++;
        }

        while (i < m){ //merge remaining first array
            res[index] = nums1[i];
            i++;
            index++;
        }

        while (j < n){ //merge reamining second array
            res[index] = nums2[j];
            j++;
            index++;
        }
        for(int k = 0;k < m+n; k++) //because function is void, this step is just copying result in array
            nums1[k] = res[k];
    }
```

## Find Pivot Index

Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the 
sum of all the numbers strictly to the index's right.

Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11

```java
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
```

## Best Time to Buy and Sell Stock

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

```java
public int maxProfit(int[] prices) {
    int minCost = prices[0];
    int profit = 0;
    for(int i = 1; i < prices.length; i++){
        profit = Math.max(profit,prices[i]-minCost);
        minCost = Math.min(minCost,prices[i]);
    }
    return profit;
}
```