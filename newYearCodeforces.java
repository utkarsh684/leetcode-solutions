import java.util.*;
public class newYearCodeforces{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        int x3=sc.nextInt();
        int min=Math.abs(x1-x2)+Math.abs(x3-x1);
        if(Math.abs(x2-x1)+Math.abs(x2-x3)<min){
            min=Math.abs(x2-x1)+Math.abs(x2-x3);
        }
        if(Math.abs(x3-x1)+Math.abs(x2-x3)<min){
            min=Math.abs(x3-x1)+Math.abs(x2-x3);
        }
        System.out.println(min);
    }
}