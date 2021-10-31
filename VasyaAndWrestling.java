import java.util.ArrayList;
import java.util.Scanner;

// codeforces.com/problemset/problem/493/B

public class VasyaAndWrestling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> v = new ArrayList<>();
        ArrayList<Integer> w = new ArrayList<>();
        int last = 0;
        long sum1 = 0, sum2 = 0;
        for(int i = 0; i < n; i++) {
            int m = s.nextInt();
            if(i == n - 1) last = m;
            if(m > 0) {
                v.add(m);
                sum1 += m;
            }
            else {
                w.add(-m);
                sum2 += -m;
            }
        }
        if(sum1 > sum2) System.out.println("first");
        else if(sum1 < sum2) System.out.println("second");
        else {
            int index = -1;
            int len = v.size() < w.size() ? w.size() : v.size();
            for(int i = 0; i < len; i++) {
                if(v.get(i) != w.get(i)) {
                    index = i;
                    break;
                }
            }
            if(index >= 0) {
                System.out.println(v.get(index) > w.get(index) ? "first" : "second");
            }
            else if(v.size() > w.size()) System.out.println("first");
            else if(v.size() < w.size()) System.out.println("second");
            else System.out.println(last > 0 ? "first" : "second");
        }
    }
}