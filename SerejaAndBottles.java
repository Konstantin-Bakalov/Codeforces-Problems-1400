import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

// codeforces.com/problemset/problem/315/A

public class SerejaAndBottles {

    static class Pair {
        int a;
        int b;

        public Pair(int a, int b) {
            this.a = a;
            this. b = b;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Pair> v = new ArrayList<>();
        HashSet<Pair> opened = new HashSet<>();
        for(int i = 0; i < n; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            v.add(new Pair(a, b));
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i != j && v.get(i).b == v.get(j).a) {
                    opened.add(v.get(j));
                }
            }
        }
        System.out.println(n - opened.size());
    }
}