import java.lang.*;
import java.util.*;

class SubscriptionsCodechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int N,X;
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=1;i<=T;i++){
		    N=sc.nextInt();
		    X=sc.nextInt();
		    if(N%6==0){
		        System.out.println(X*((N/6)));
		    }
		    else{
		        System.out.println(X*((N/6)+1));
		    }
		}

	}
}
