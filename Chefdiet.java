import java.util.*;
import java.lang.*;
import java.io.*;

class Chefdiet {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while (T-- > 0) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int arr[] = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}

			System.out.println(func(K, N, arr));
		}
	}

	public static String func(int K, int N, int arr[]) {
		for (int i = 0; i < N; i++) {
			if (K > arr[i]) {
				return "NO " + (i + 1);
			} else {
				if (i != N - 1) {
					arr[i + 1] += arr[i] - K;
				}
			}
		}
		return "YES";
	}

}
