import java.util.Scanner;

public class BitCodeforces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); 
        int x = 0; 
        for (int i = 0; i < n; i++) {
            String operation = scanner.next();
            if (operation.contains("++")) {
                x += 1;
            } else {
                x -= 1;
            }
        }

        System.out.println(x);
    }
}
