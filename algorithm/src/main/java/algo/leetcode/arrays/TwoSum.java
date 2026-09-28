package algo.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> posMap = new HashMap<>();
        posMap.put(nums[0],0);
        for(int i = 1; i < nums.length; i++){
            int complement = target - nums[i];
            if(posMap.containsKey(complement))
                return new int[]{i,posMap.get(complement)};
            posMap.put(nums[i],i);
        }
        return new int[]{};
    }
}
