import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// codeforces.com/problemset/problem/1197/C

public class ArraySplitting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        long res = a[n - 1] - a[0];
        ArrayList<Integer> v = new ArrayList<>();
        for(int i = 1; i < n; i++) v.add(a[i - 1] - a[i]);
        Collections.sort(v);
        for(int i = 0; i < k - 1; i++) res += v.get(i);
        System.out.println(res);
    }
}