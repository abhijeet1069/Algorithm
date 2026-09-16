# Hashmap

## 1. What is a hashmap

HashMap<K,V> stores data as key-value pairs.

```java
Map<String, Integer> map = new HashMap<>();

map.put("Alice", 10);
map.put("Bob", 20);

System.out.println(map.get("Alice")); // 10
```
### Important properties

- Keys are unique
- Values can be duplicated
- Allows one null key
- Allows multiple null values
- Not synchronized / not thread safe
- Does not guarantee iteration order
- Average put,get,remove: O(1)

Operation,Average Case ,Worst Case (High Collisions)
Search   ,O(1)            ,O(n)
Insert   ,O(1)            ,O(n)
Delete   ,O(1)            ,O(n)

## 2. How does HashMap work internally?

```text
//conceptual view of a HashMap
             HashMap
                |
             array[]
                |
       -------------------
       |   |   |   |   |
       0   1   2   3   4
                   |
                 bucket
                   |
              Node -> Node
```

```java
map.put("hello",100);

// Step 1: Calculate hash
"hello".hashCode();

// Step 2: Find bucket - The hash determines which bucket the entry belongs to
//java uses below formula to calculate bucket index
(hash ^ (hash >>> 16)) & (n - 1)

// Step 3 : Store the entry
If there is no collision, you are basically done.
If there is collision, multiple entries occupy the same bucket
```
## 3. What is hashing?

In the context of hash tables, hashing is a technique used to convert a search key (like a string or ID)
into a numerical index that maps directly to an array slot (bucket) where the associated value is stored.

Unlike cryptographic hashing (which prioritizes security and irreversibility), hashing in hash tables
prioritizes speed and uniform distribution to achieve constant-time O(1) lookups, insertions, and deletions.

## 4. What is collision

Two different keys can produce the same bucket. This is a hash collision.

HashMap handles collision by storing multiple entries in the same bucket. Historically, this was a linked list.
Modern Java can transform a heavily collided bucket into a Red-Black tree.

## 5. How does HashMap handle collisions?
Because array sizes are finite, two different keys will eventually hash to the same index. This is called a collision. 
Common resolution strategies include:

### Chaining (Open Hashing)
Each array slot holds a linked list. Multiple keys hashing to the same index are simply appended to the list 
at that slot.

### Open Addressing (Closed Hashing)
If a slot is occupied, the table searches for the next available slot using methods like:

#### Linear Probing

Check index +1, +2, +3 ... 

#### Quadratic Probing: 
Quadratic probing and double hashing are advanced collision resolution techniques used in open addressing hash tables. 
They were created to solve primary clustering—a major flaw in linear probing where colliding elements form long, 
contiguous blocks in memory, slowing down searches.

index_i = (hash(key) + i^2) mod table_size

- How it works: If slot h is full, it checks h+1, then h+4, then h+9, then h+16, and so on.
- Solves: Eliminates primary clustering by spreading items further across the array.
- Drawback (Secondary Clustering): If two keys yield the exact same initial hash value, 
  they will still follow the exact same sequence of probes.

#### Double Hashing

Use a second hash function to determine the step size.

## 6. Why are equals() and hashCode() both important?

## 7. Explain the equals()/hashCode() contract.
## 8. What happens if two objects have the same hash code?
## 9. What happens if two objects are equal but have different hash codes?
## 10. Why should HashMap keys generally be immutable?
## 11. What is a bucket?
## 12. What is the load factor?
## 13. What is the default load factor?
## 14. What happens when HashMap exceeds its threshold?
## 15. What is resizing?
## 16. Why is capacity generally a power of two?
## 17. What is treeification?
## 18. Why does Java use Red-Black Trees in heavily-collided buckets?
## 19. What is the complexity of get()?
## 20. What is the worst-case complexity?

## 21. Does HashMap allow null keys?
## 22. Does HashMap allow null values?
## 23. Does HashMap maintain insertion order?
## 24. HashMap vs LinkedHashMap?
## 25. HashMap vs TreeMap?
## 26. HashMap vs Hashtable?
## 27. HashMap vs ConcurrentHashMap?
## 28. Is HashMap thread-safe?
## 29. What does put() return?
## 30. Difference between get() and containsKey()?

## Coding

## 31. Frequency counting
## 32. Two Sum
## 33. Detect duplicates
## 34. Group anagrams
## 35. Longest substring without repeating characters
## 36. Subarray sum equals K
## 37. Top K frequent elements
## 38. First non-repeating character
## 39. Find intersection of arrays
## 40. Longest consecutive sequence