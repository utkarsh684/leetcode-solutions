import java.lang.*;
import java.util.*;

class CheflandGames
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
		    int R1=sc.nextInt();
		    int R2=sc.nextInt();
		    int R3=sc.nextInt();
		    int R4=sc.nextInt();
		    int count=0;
		    if(R1 == 0){
		        count++;
		    }
		     if(R2 == 0){
		        count++;
		    }
		     if(R3 == 0){
		        count++;
		    }
		     if(R4 == 0){
		        count++;
		    }
		    if(count ==4){
		        System.out.println("IN");
		    }
		    else{
		        System.out.println("OUT");
		    }
		    
		}
	}
}

