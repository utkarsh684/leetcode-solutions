import java.util.*;
class leetcode228 {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> list=new ArrayList<>();
        if(nums.length==0){
            return list;
        }
        int val=nums[0];
        int last=nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]+1){
                last=nums[i+1];
            }

            else{
                if(val!=last){
                list.add(val +"->" +last);
                val=nums[i+1];
                last=nums[i+1];
                }
                else{
                    list.add(Integer.toString(val));
                    val=nums[i+1];
                    last=nums[i+1];
                }
            }
        }

        if(val==last){
            list.add(Integer.toString(nums[nums.length-1]));
        }
        else{
            list.add(val +"->"+ last);
        }
        return list;
    }
}
