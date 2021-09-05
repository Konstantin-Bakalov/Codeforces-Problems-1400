import java.util.Scanner;

// codeforces.com/problemset/problem/1462/D

public class AddToNeighbourAndRemove {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int sum = 0;
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = s.nextInt();
                sum += a[i];
            }
            for(int i = n; i >= 1; i--) {
                if(sum % i == 0) {
                    int goal = sum / i;
                    int d = 0;
                    boolean b = true;
                    for(int j = 0; j < n; j++) {
                        d += a[j];
                        if(d > goal) {
                            b = false;
                            break;
                        }
                        else if(d == goal) {
                            d = 0;
                        }
                    }
                    if(b) {
                        System.out.println(n - i);
                        break;
                    }
                }
            }
        }
    }
}