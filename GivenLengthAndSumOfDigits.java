import java.util.ArrayList;
import java.util.Scanner;

// codeforces.com/problemset/problem/489/C

public class GivenLengthAndSumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ss = s.nextInt();
        int m = s.nextInt();
        if(ss == 0 || 9 * ss < m || (m == 0 && ss != 1)) System.out.println("-1 -1");
        else if(m == 0 && ss == 1) System.out.println("0 0");
        else {
            if(ss == 1) {
                if(m <= 9) System.out.println(m + " " + m);
                else System.out.println("-1 -1");
            }
            else {
                ArrayList<Integer> smallest = new ArrayList<>();
                ArrayList<Integer> biggest = new ArrayList<>();
                int copy = m;
                while(biggest.size() != ss) {
                    if(copy > 0) {
                        int d = copy >= 9 ? 9 : copy;
                        biggest.add(d);
                        copy -= d;

                    }
                    else biggest.add(0);
                }
                int sum = 0, copy1 = m;
                while(smallest.size() != ss) {
                    if(m - 1 > 0) {
                        int d = m - 1 >= 9 ? 9 : m - 1;
                        smallest.add(d);
                        m -= d;
                    }
                    else if(m - 1 == 0 && smallest.size() != ss - 1) smallest.add(0);
                    else {
                        smallest.add(1);
                        break;
                    }
                }
                for(int i = 0; i < smallest.size(); i++) sum += smallest.get(i);
                if(sum < copy1) smallest.set(smallest.size() - 1, smallest.get(smallest.size() - 1) + 1);
                for(int i = smallest.size() - 1; i >= 0; i--) System.out.print(smallest.get(i));
                System.out.print(" ");
                for(int i = 0; i < biggest.size(); i++) System.out.print(biggest.get(i));
                System.out.println();
            }
        }
    }
}