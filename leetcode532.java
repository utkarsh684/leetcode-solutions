import java.util.*;
class leetcode532 {
    public int findPairs(int[] nums, int k) {
         Map<Integer, Integer> counts = new HashMap<>();

         int count=0;

        for(int num : nums){
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        for(int key:counts.keySet()){
            if((k>0 && counts.containsKey(key+k)) || (k==0 && counts.get(key)>1)){
                count++;
            }
        }
        return count;
    }
}