import java.util.Scanner;

// codeforces.com/problemset/problem/1363/B

public class SubsequenceHate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            String str = s.next();
            char[] a = str.toCharArray();
            int zeroes = 0, ones = 0;
            for(int i = 0; i < a.length; i++) {
                if(a[i] == '0') zeroes++;
            }
            ones = a.length - zeroes;
            int res = Math.min(ones, zeroes);
            int pref0 = 0, pref1 = 0;
            for(int i = 0; i < a.length; i++) {
                if(a[i] == '1') {
                    pref1++;
                    ones--;
                }
                else {
                    pref0++;
                    zeroes--;
                }
                res = Math.min(res, pref0 + ones);
                res = Math.min(res, pref1 + zeroes);
            }
            System.out.println(res);
        }
    }
}
