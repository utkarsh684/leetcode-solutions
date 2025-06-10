import java.lang.*;
import java.util.*;

class ExamsCodechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int X,Y,Z;
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
		    X=sc.nextInt();
		    Y=sc.nextInt();
		    Z=sc.nextInt();
		    if((double)Z/(X*Y)>0.5){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}

	}
}
