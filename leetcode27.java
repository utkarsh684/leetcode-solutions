class leetcode27 {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count++]=nums[i];
            }
            else{
                continue;
            }
        }
        return count;
    }
}