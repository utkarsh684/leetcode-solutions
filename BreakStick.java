import java.lang.*;
import java.util.*;

class BreakStick
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int N=sc.nextInt();
		    int X=sc.nextInt();
		    if((N%2==0||X%2==N%2) && X<=N){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}

	}
}

