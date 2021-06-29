import java.util.Scanner;

// codeforces.com/problemset/problem/1520/E

public class ArrangingTheSheep {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            String str = s.next();
            long res = 0;
            int sheep = 0;
            for(int i = 0; i < str.length(); i++)
                if(str.charAt(i) == '*') sheep++;
            int m = (int) Math.ceil((double)sheep / 2);
            int d = 0, index = 0;
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '*') d++;
                if(d == m) {
                    index = i;
                    break;
                }
            }
            int curr = 1;
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '*') {
                    if(curr != m) res += Math.abs(i - (index - m + curr));
                    curr++;
                }
            }
            System.out.println(res);
        }
    }
}