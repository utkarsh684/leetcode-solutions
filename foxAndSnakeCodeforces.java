import java.util.*;
public class foxAndSnakeCodeforces{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=m; j++) {
                System.out.print("#");
            }
            for(int k=0;k<2;k++){
                System.out.println("#");
            }
            for(int k=m;k>=1;k--){
                System.out.print("#");
            }
            
        }
    }
}