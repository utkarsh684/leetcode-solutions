class leetcode26 {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int val=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=val){
                 nums[count++]=nums[i];
                val=nums[i];
            }
        }
        return count;
    }
}
