import java.util.*;

class WaterFillingCodechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int[] arr = new int[3];
            int zeroCount = 0;
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 0) zeroCount++;
            }

            if (zeroCount >= 2) {
                System.out.println("Water filling time");
            } else {
                System.out.println("Not now");
            }
        }
    }
}
