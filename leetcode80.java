public class leetcode80 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int j = 0;
        int count = 1;
        int val = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
            } else {
                nums[j++] = val;
                if (count > 1) nums[j++] = val;
                val = nums[i];
                count = 1;
            }
        }
        nums[j++] = val;
        if (count > 1) nums[j++] = val;

        return j;
    }
}

