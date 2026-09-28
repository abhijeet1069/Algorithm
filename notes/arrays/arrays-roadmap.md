# Recommended Learning Order

Don't necessarily solve them in numerical order. Study them by pattern.

## 1. HashMap / HashSet

- [ ] **1. Two Sum**
- [ ] **217. Contains Duplicate**
- [ ] **169. Majority Element**
- [ ] **349. Intersection of Two Arrays**
- [ ] **350. Intersection of Two Arrays II**
- [ ] **128. Longest Consecutive Sequence**
- [ ] **49. Group Anagrams**

---

## 2. Basic Array Manipulation

- [ ] **26. Remove Duplicates from Sorted Array**
- [ ] **27. Remove Element**
- [ ] **283. Move Zeroes**
- [ ] **189. Rotate Array**
- [ ] **88. Merge Sorted Array**

---

## 3. Two Pointers

- [ ] **167. Two Sum II**
- [ ] **977. Squares of a Sorted Array**
- [ ] **11. Container With Most Water**
- [ ] **15. 3Sum**
- [ ] **18. 4Sum**

### Important milestone

**15. 3Sum**

Understand this structure:

```text
sort
  ↓
fix one element
  ↓
two pointers for the remaining two
```

---

## 4. Prefix Sum

- [ ] **724. Find Pivot Index**
- [ ] **303. Range Sum Query - Immutable**
- [ ] **560. Subarray Sum Equals K**
- [ ] **525. Contiguous Array**
- [ ] **238. Product of Array Except Self**

---

## 5. Sliding Window

### Fixed Window

- [ ] **643. Maximum Average Subarray I**

### Variable Window

- [ ] **209. Minimum Size Subarray Sum**
- [ ] **1004. Max Consecutive Ones III**
- [ ] **904. Fruit Into Baskets**
- [ ] **3. Longest Substring Without Repeating Characters**

---

## 6. Kadane / Running State

- [ ] **121. Best Time to Buy and Sell Stock**
- [ ] **53. Maximum Subarray**
- [ ] **918. Maximum Sum Circular Subarray**
- [ ] **152. Maximum Product Subarray**

---

## 7. Sorting / Greedy / Intervals

- [ ] **75. Sort Colors**
- [ ] **56. Merge Intervals**
- [ ] **57. Insert Interval**
- [ ] **435. Non-overlapping Intervals**
- [ ] **452. Minimum Number of Arrows to Burst Balloons**

---

## 8. Matrix / 2D Arrays

- [ ] **54. Spiral Matrix**
- [ ] **48. Rotate Image**
- [ ] **73. Set Matrix Zeroes**
- [ ] **74. Search a 2D Matrix**
- [ ] **289. Game of Life**

---

## 9. Advanced Array Problems

- [ ] **42. Trapping Rain Water**
- [ ] **239. Sliding Window Maximum**
- [ ] **41. First Missing Positive**
- [ ] **84. Largest Rectangle in Histogram**
- [ ] **215. Kth Largest Element in an Array**

---

# How to Use This List

For each problem, record:

### 1. Pattern

What technique does this problem use?

### 2. Observation

What property of the problem allows the technique to work?

### 3. Algorithm

Write the algorithm in your own words before coding.

### 4. Complexity

Record:

```text
Time:  O(?)
Space: O(?)
```

### 5. Mistakes

Write down what you got wrong.

---

# Completion Criteria

Don't consider a pattern "complete" just because you solved the problems.

You should be able to look at a new problem and ask:

```text
Is this a HashMap problem?
        ↓
Can sorting help?
        ↓
Can I use two pointers?
        ↓
Is this a sliding window?
        ↓
Can prefix/suffix information help?
        ↓
Is there a running minimum/maximum?
        ↓
Is this an interval problem?
        ↓
Is this a matrix/indexing problem?
```

The goal is to build a **pattern library**, not memorize 50 solutions.

---

# Suggested Priority

If time is limited, prioritize these first:

### Must Master

- [x] **1. Two Sum**
- [ ] **121. Best Time to Buy and Sell Stock**
- [ ] **53. Maximum Subarray**
- [ ] **26. Remove Duplicates from Sorted Array**
- [ ] **283. Move Zeroes**
- [ ] **167. Two Sum II**
- [ ] **977. Squares of a Sorted Array**
- [ ] **11. Container With Most Water**
- [ ] **15. 3Sum**
- [ ] **238. Product of Array Except Self**
- [ ] **560. Subarray Sum Equals K**
- [ ] **209. Minimum Size Subarray Sum**
- [ ] **75. Sort Colors**
- [ ] **56. Merge Intervals**
- [ ] **42. Trapping Rain Water**

These give you exposure to most of the important array patterns.