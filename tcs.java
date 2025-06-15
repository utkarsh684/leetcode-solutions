import java.lang.*;
import java.util.*;

class tcs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int dsa1=sc.nextInt();
		     int toc1=sc.nextInt();
		      int dm1=sc.nextInt();
		       int dsa2=sc.nextInt();
		        int toc2=sc.nextInt();
		         int dm2=sc.nextInt();
		         int tot1=dsa1+dm1+toc1;
		         int tot2=dsa2+dm2+toc2;
		         if(tot1>tot2){
		             System.out.println("Dragon");
		         }
		         else if(tot1==tot2){
		             if(dsa1>dsa2){
		                 System.out.println("Dragon");
		             }
		             else if(dsa1<dsa2){
		                 System.out.println("Sloth");
		             }
		             else if(dsa1 == dsa2 && toc1>toc2){
		                 System.out.println("Dragon");
		             }
		             else if(dsa1==dsa2 && toc1<toc2){
		                 System.out.println("Sloth");
		             }
		             else if(dsa1==dsa2 && toc1==toc2){
		                 System.out.println("tie");
		             }
		             
		         }
		         else if(tot1<tot2){
		             System.out.println("Sloth");
		         }
		}

	}
}

