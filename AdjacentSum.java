/* package codechef; // don't place package name! */

/* package codechef; // don't place package name! */

import java.lang.*;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class AdjacentSum
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int x=sc.nextInt();
	    for(int i=0;i<x;i++)
	    {
	        int a=sc.nextInt();
	        int arr[]=new int[a];
	        int s=0;
	        for(int j=0;j<a;j++)
	        {
	            arr[j]=sc.nextInt();
	            s=s+arr[j];
	        }
	        if(s%2==0)
	        System.out.println("Yes");
	        else System.out.println("No");
	    }
		// your code goes here
	}
}
