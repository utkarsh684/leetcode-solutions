import java.util.*;
import java.lang.*;
import java.io.*;

class Candies {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int N = sc.nextInt();
			int arr[] = new int[2 * N];
			for (int i = 0; i < 2 * N; i++) {
				arr[i] = sc.nextInt();
			}
			Map<Integer, Integer> map = new HashMap<>();
			int count = 0;

			for (int num : arr) {
				map.put(num, map.getOrDefault(num, 0) + 1);
			}

			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				if (entry.getValue() >= 3) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}

		}

	}
}
