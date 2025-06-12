import java.lang.*;
import java.util.*;

class MinimumPizzas
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
		    int N=sc.nextInt();
		    int X=sc.nextInt();
		    System.out.println(((N*X)+3)/4);
		}

	}
}

