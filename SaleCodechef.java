import java.util.*;
import java.lang.*;
import java.io.*;

class SaleCodechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
		    int X=sc.nextInt();
		    if(X<=100){
		        System.out.println(X);
		    }
		    else if(X>100 && X<=1000){
		        System.out.println(X-25);
		    }
		    else if(X>1000 && X<=5000){
		        System.out.println(X-100);
		    }
		    else{
		        System.out.println(X-500);
		    }
		}
	}
}
