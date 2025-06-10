import java.util.*;
public class SoftCodeforces {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();
        int drink=(k*l)/nl;
        int limes=(c*d)/1;
        int salt=p/np;
        System.out.println();
        System.out.println(Math.min(Math.min(drink,limes),salt)/3);

    }
}