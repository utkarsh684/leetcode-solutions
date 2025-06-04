import java.util.*;
import java.lang.*;
import java.io.*;

class greaterAverageCodechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    double A, B,C;
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=1;i<=T;i++){
		    A=sc.nextDouble();
		    B=sc.nextDouble();
		    C=sc.nextDouble();
		    if((A+B)/2>C){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
