import java.lang.*;
import java.util.*;

class Mahasena
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr =new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    
		}
		int count1=0;
		int count2=0;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]%2==0){
		        count1++;
		    }
		    else{
		        count2++;
		    }
		}
		System.out.println(count1>count2? "READY FOR BATTLE" : "NOT READY");

	}
}

