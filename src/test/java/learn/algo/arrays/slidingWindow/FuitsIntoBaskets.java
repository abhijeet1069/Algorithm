package learn.algo.arrays.slidingWindow;

import java.util.*;

public class FuitsIntoBaskets {
    public int totalFruit(int[] fruits) {
        int l = 0;
        Map<Integer,Integer> basket = new HashMap<>();
        int maxSum = 0;
        for(int r = 0; r < fruits.length; r++){
            basket.put(fruits[r],basket.getOrDefault(fruits[r],0)+1);

            while(basket.size() > 2){
                //This the critical part, I was removing entire left fruit. But it has to be decremented by 1
                basket.put(fruits[l], basket.get(fruits[l]) - 1);
                if (basket.get(fruits[l]) == 0) {
                    basket.remove(fruits[l]);
                }
                l++;
            }
            maxSum = Math.max(maxSum,r-l+1);
        }
        return maxSum;
    }
}
