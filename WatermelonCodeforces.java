import java.util.*;
public class WatermelonCodeforces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        if(w%2==0 && w!=2){
            System.out.println("yes");
        }
        else if(w==2){
            System.out.println("no");
        }
        else if(w%2!=0){
            System.out.println("no");
        }
    }
}
