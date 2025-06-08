import java.util.*;

public class FalseAlarm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int first = -1;
            int last = -1;

            for(int i = 0; i < n; i++){
                if(arr[i] == 1){
                    if(first == -1) first = i;
                    last = i;
                }
            }

            if(last - first + 1 <= x){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
