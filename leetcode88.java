class leetcode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a=m-1;
        int b=n-1;
        int t=m+n-1;
        while(b>=0){
            
            if(a>=0 && nums1[a]>nums2[b]){
                nums1[t]=nums1[a];
                a--;
                t--;
            }
            else{
                nums1[t]=nums2[b];
                b--;
                t--;
            }
        }
    }
}
