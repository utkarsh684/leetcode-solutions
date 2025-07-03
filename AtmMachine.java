import java.util.*;
import java.lang.*;
import java.io.*;

class AtmMachine
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int N=sc.nextInt();
		    int K=sc.nextInt();
		    int[] A=new int[N];
		    for(int i=0;i<N;i++){
		        A[i]=sc.nextInt();
		        if(A[i]<=K){
		            System.out.print(1);
		            K=K-A[i];
		        }
		        else{
		            System.out.print(0);
		        }
		    }
		    System.out.println();
		    
		}

	}
}

