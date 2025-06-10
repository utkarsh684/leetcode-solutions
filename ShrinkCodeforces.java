import java.util.*;

public class ShrinkCodeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] res = new int[n];
            int left = 1, right = n;
            boolean pickLeft = false;
            for (int i = 0; i < n; i++) {
                if (pickLeft) {
                    res[i] = left++;
                } else {
                    res[i] = right--;
                }
                pickLeft = !pickLeft;
            }
            for (int num : res)
                System.out.print(num + " ");
            System.out.println();
        }
    }
}
