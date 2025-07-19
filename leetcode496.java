class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int i=0;
        int res[]=new int[nums1.length];
        Map<Integer,Integer> map=new HashMap<>();
        int flag=0;
        for(int k=0;k<nums2.length;k++){
            map.put(nums2[k],k);
        }
        while(i<nums1.length){
            int index=map.get(nums1[i]);
            for(int j=index+1;j<nums2.length;j++){
                if(nums2[j]>nums1[i]){
                    res[i]=nums2[j];
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                res[i]=-1;
            }
            i++;
            flag=0;
        }
        return res;
    }
}
