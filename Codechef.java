import java.util.*;

public class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        while (T-- > 0) {
            int N = sc.nextInt(); // Number of attacks
            int X = sc.nextInt(); // Initial skill level

            int[] A = new int[N]; // Dodge skill requirements
            int[] B = new int[N]; // Parry skill requirements

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }

            int M = 0; // Maximum parries

            boolean win = true;

            for (int i = 0; i < N; i++) {
                if (X < A[i]) {
                    win = false;
                    break; // Chef loses
                } else if (X >= B[i]) {
                    // Can parry
                    X--; // Lose 1 skill point
                    M++; // Increase parry count
                }
                // else: Only dodge (X >= A[i] && X < B[i])
                // Just continue, no change in X
            }

            System.out.println(win ? M : 0);
        }
    }
}
