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

## Largest Time for Given Digits

Given an array arr of 4 digits, find the latest 24-hour time that can be made using each digit exactly once.

24-hour times are formatted as "HH:MM", where HH is between 00 and 23, and MM is between 00 and 59.
The earliest 24-hour time is 00:00, and the latest is 23:59.

Return the latest 24-hour time in "HH:MM" format. If no valid time can be made, return an empty string.

Example 1:
Input: arr = [1,2,3,4]
Output: "23:41"
Explanation: The valid 24-hour times are "12:34", "12:43", "13:24", "13:42", "14:23", "14:32", "21:34", "21:43",
"23:14", and "23:41". Of these times, "23:41" is the latest.

Example 2:
Input: arr = [5,5,5,5]
Output: ""
Explanation: There are no valid 24-hour times as "55:55" is not valid.

```java
// Here we just brute forced, as we had just 24 combinations
// This loop also shows how to generate all 4! permutations of arr
    public String largestTimeFromDigits(int[] arr) {
    int max = -1;
    String ans = "";
    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++){
            if(j == i)
                continue;
            for(int k = 0; k < 4; k++){
                if(k == i || k == j)
                    continue;

                for(int l = 0; l < 4; l++){
                    if(l == i || l == j || l == k)
                        continue;

                    int hour = arr[i]*10+arr[j];
                    int min = arr[k]*10+arr[l];
                    if(hour < 24 && min < 60){
                        int total = hour*60+min;
                        if(max < total){
                            max = total;
                            ans = ""+arr[i]+""+arr[j]+":"+arr[k]+""+arr[l];
                        }
                    }
                }
            }
        }
    }
    return ans;
}
```

## Majority element

Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.

Input: nums = [3,2,3]
Output: 3

Input: nums = [2,2,1,1,1,2,2]
Output: 2

The code is based on Moore's voting algorithm.
This algorithm only works directly if a majority element is guaranteed to exist.

Every different element cancels one occurrence of the candidate.
If a majority element exists, it can never be completely canceled because it appears more than half the time.

```java
    public int majorityElement(int[] nums) {
    int count = 0;
    int candidate = 0;

    for (int num : nums) {
        if (count == 0)
            candidate = num;

        if (num == candidate)
            count++;
        else
            count--;
    }
    return candidate;
}
```

## Jump Game

You are given an integer array nums. You are initially positioned at the array's first index,
and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

Input: nums = [2,3,1,1,4]
Output: true

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0,
which makes it impossible to reach the last index.

Instead of asking:
“Can I reach the end from index 0?”

it asks the opposite:
“Which indices can reach the end?”

```java
 public boolean canJump(int[] nums){ //beautiful solution
    int goal = nums.length-1;
    for(int i = nums.length-2; i >= 0; i--){
        if(i+nums[i] >= goal)
            goal = i;
    }
    return goal == 0;
}
```

## Trapping Rain Water

Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much
water it can trap after raining.

Input: height = [4,2,0,3,2,5]
Output: 9

```shell
height      =      [4,2,0,3,2,5]
L (max on left)  = [0,4,4,4,4,4]       
R (max on right) = [5,5,5,5,5,0]
res[i] = min(L[i],R[i]) - height[i] # if negative then res[i] will be zero
then sum the res array 
```

```java
 public boolean canJump(int[] nums){ //beautiful solution
    int goal = nums.length-1;
    for(int i = nums.length-2; i >= 0; i--){
        if(i+nums[i] >= goal)
            goal = i;
    }
    return goal == 0;
}
```

## Count Inversions

Number of inversions = {(i,j),(p,q)} such that M[i][j] > M[p][q] & i<=p & j<=q

```java
public static long countInversionsInMatrix(int[][] matrix, int n) { // NxN matrix
        long count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int p = i; p < n; p++) {
                    for (int q = j; q < n; q++) {
                        if (matrix[i][j] > matrix[p][q])
                            count++;
                    }
                }
            }
        }
        return count;
    }

    public static int countInversionsInArray(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] > arr[j]) {
                count++;
            }
        }
    }
    return count;
}
```

## Array rotation

res[(i+rotations)%arr.length] = arr[i]; //rotate right by rotations