import java.util.Scanner;

// codeforces.com/problemset/problem/260/A

public class AddingDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int n = s.nextInt();
        boolean ok = false;
        for(int i = 0; i <= 9; i++) {
            if((10 * a + i) % b == 0) {
                a = 10 * a + i;
                ok = true;
                break;
            }
        }
        if(!ok) System.out.println(-1);
        else {
            System.out.print(a);
            for(int i = 0; i < n - 1; i++)
                System.out.print("0");
        }
    }
}