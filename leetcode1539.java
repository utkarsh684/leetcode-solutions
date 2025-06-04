import java.util.*;

public class leetcode1539 {
    public static int findKthPositive(int[] arr, int k) {
        List<Integer> ls=new ArrayList<>();
          int temp=arr[0];
          if(arr[0]==1  && arr[arr.length-1]==arr.length){
            return arr[arr.length-1]+k;
          }
          for(int i=0;i<arr.length;i++){
            if(temp==arr[i]){
                temp++;
            }
            else{
                for(int j=arr[i-1];j<arr[i];j++){
                    ls.add(j);
                }
                temp=arr[i];
            }
          }
          return ls.get(k);
    }
    @SuppressWarnings("unused")
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        int k=2;
        System.out.println(findKthPositive(arr, k));
    }
}
