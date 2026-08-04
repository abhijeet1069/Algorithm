# Arrays Roadmap (Pattern-Based)

This roadmap is organized by techniques rather than difficulty. Master
each pattern before moving to the next.

------------------------------------------------------------------------

## Key ideas

- For 2 sum approach, in a sorted array for 2 pointer left and right, moving left pointer increases the sum of array.
  And moving right pointer decreases the sum of array.

- For 2 sum approach, in an unsorted array, use hashmap to store the indices.

## Phase 1: Array Fundamentals

### Two Sum
Use a HashMap to store array elements then lookup for previous inserted HashMap elements
Here indices of elements had to be returned, so array wasn't stored, however if the array was sorted
we could had easily used 2 pointer approach.

###  Remove Duplicates from Sorted Array
Don't focus on duplicates but on unique items

### Remove Element
Here, also focus on unique elements, no treatment given to duplicates. They were simply over-written

```java
public int removeElement(int[] nums, int val) {
        int j = 0;
        
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] != val) {
        		nums[j] = nums[i];
        		j++;
        	}
        }
        return j;
    }
```

### Merge Sorted Array                    
Use the standard merging approach in merge sort, some people are appending 2nd array in nums1 
and simply sorting it

### Find Pivot Index                        
Compute left sum, right sum. Check index where both are equal else return -1

### Best Time to Buy and Sell Stock

```java
profit = 0, minCost = cost at day 0
for each day starting from 1, compute,
    profit = Math.max(profit,prices[i] - minCost); //maximise the profit
    minCost = Math.min(minCost,prices[i]); //minimise the cost
return profit
```
------------------------------------------------------------------------

## Phase 2: Two Pointers

Main remembering point is how to normalise the string

### Valid Palindrome

```shell
# removes all non alphanumeric characters in a string
s.replaceAll("[^a-zA-Z0-9]", "")
```
Remaining problem, is to place left and right pointer at end of the string,
then keep comparing the characters till l < r

### Two Sum II - Input Array Is Sorted

In a sorted array, mark l and r pointers to both ends.
For ex : [2,7,11,15] as l right moves arr[l]+arr[r] increases, however as you move r left
the sum decreases

###  Move Zeroes

The question was very similar to remove element, except here the ignored array part is filled with zeros

###  Squares of a Sorted Array

Mark l and r at two ends of array. while l <= r, compare the absolute values of array elements
at both indices, insert square of the higher values from back of the result array

###  Container With Most Water

Try to use two-pointers. Set one pointer to the left and one to the right of the array. Always move the pointer 
that points to the lower height. And that height makes the current area. Then find the max area

###  3Sum

```java
public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0;i < nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1])
                continue;

            int left = i+1;
            int right = nums.length-1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left < right && nums[left] == nums[left+1]) //skip duplicates
                        left++;
                    while(left < right && nums[right] == nums[right-1]) //skip 
                        right--;
                    left++;
                    right--;
                }
                else if(sum < 0)
                    left++; //increses the sum
                else
                    right--; // decreases the sum
            }
        }
        return result;
    }
```

###  4Sum (Optional)

------------------------------------------------------------------------

## Phase 3: Sliding Window

### Fixed Window

  Problem                                                   LeetCode
  --------------------------------------------------------- ----------
  Maximum Average Subarray I                                643
  Maximum Sum Circular Subarray *(Optional after Kadane)*   918

### Variable Window

  Problem                                          LeetCode
  ------------------------------------------------ ----------
  Longest Substring Without Repeating Characters   3
  Minimum Size Subarray Sum                        209
  Fruit Into Baskets                               904
  Longest Repeating Character Replacement          424
  Minimum Window Substring                         76

------------------------------------------------------------------------

## Phase 4: Prefix Sum

  Problem                        LeetCode
  ------------------------------ ----------
  Range Sum Query - Immutable    303
  Subarray Sum Equals K          560
  Continuous Subarray Sum        523
  Product of Array Except Self   238
  Find Pivot Index               724

------------------------------------------------------------------------

## Phase 5: Hashing

  Problem                        LeetCode
  ------------------------------ ----------
  Contains Duplicate             217
  Majority Element               169
  Top K Frequent Elements        347
  Longest Consecutive Sequence   128
  Happy Number                   202
  Intersection of Two Arrays     349

------------------------------------------------------------------------

## Phase 6: Binary Search on Arrays

  Problem                                   LeetCode
  ----------------------------------------- ----------
  Binary Search                             704
  Search Insert Position                    35
  First Bad Version                         278
  Search in Rotated Sorted Array            33
  Find Minimum in Rotated Sorted Array      153
  Find Peak Element                         162
  Koko Eating Bananas                       875
  Capacity To Ship Packages Within D Days   1011

------------------------------------------------------------------------

## Phase 7: Sorting

  Problem                                      LeetCode
  -------------------------------------------- ----------
  Sort Colors                                  75
  Merge Intervals                              56
  Insert Interval                              57
  Meeting Rooms *(Premium / Similar)*          252
  Largest Number                               179
  Minimum Number of Arrows to Burst Balloons   452

------------------------------------------------------------------------

## Phase 8: Matrix

  Problem                 LeetCode
  ----------------------- ----------
  Rotate Image            48
  Set Matrix Zeroes       73
  Spiral Matrix           54
  Spiral Matrix II        59
  Search a 2D Matrix      74
  Search a 2D Matrix II   240

------------------------------------------------------------------------

## Phase 9: Kadane's Algorithm

  Problem                         LeetCode
  ------------------------------- ----------
  Maximum Subarray                53
  Maximum Sum Circular Subarray   918
  Maximum Product Subarray        152

------------------------------------------------------------------------

## Phase 10: Monotonic Stack

  Problem                          LeetCode
  -------------------------------- ----------
  Next Greater Element I           496
  Daily Temperatures               739
  Online Stock Span                901
  Largest Rectangle in Histogram   84
  Trapping Rain Water              42

------------------------------------------------------------------------

## Phase 11: Greedy Arrays

  Problem        LeetCode
  -------------- ----------
  Jump Game      55
  Jump Game II   45
  Gas Station    134
  Candy          135

------------------------------------------------------------------------

## Phase 12: Advanced Techniques

  Technique                Recommended Problem
  ------------------------ ---------------------------
  Dutch National Flag      75 - Sort Colors
  Difference Array         1094 - Car Pooling
  Coordinate Compression   327 - Count of Range Sum
  Sweep Line               253 - Meeting Rooms II
  Bucket Sort              164 - Maximum Gap
  Boyer-Moore Voting       229 - Majority Element II

------------------------------------------------------------------------

## Phase 13: Hard Problems

  Problem                       LeetCode
  ----------------------------- ----------
  First Missing Positive        41
  Trapping Rain Water           42
  Sliding Window Maximum        239
  Median of Two Sorted Arrays   4
  Maximum Gap                   164

------------------------------------------------------------------------