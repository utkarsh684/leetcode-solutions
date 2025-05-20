import java.util.*;

class leetcode414 {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> ts = new TreeSet<>();
        for (int num : nums) {
            ts.add(num);
        }

        if (ts.size() < 3) {
            if (ts.size() == 1) {
                return ts.first();
            } else if (ts.size() == 2) {
                return ts.last();
            }
        }
        ts.pollLast();
        ts.pollLast();
        return ts.last();
    }
}