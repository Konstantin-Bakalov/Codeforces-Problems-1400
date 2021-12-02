import java.util.Scanner;

// codeforces.com/problemset/problem/1009/B

public class MinimumTernaryString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        boolean b = true;
        int ones = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '2') b = false;
            if(str.charAt(i) == '1') ones++;
            else {
                if(b) first.append(str.charAt(i));
                else second.append(str.charAt(i));
            }
        }
        System.out.print(first);
        for(int i = 0; i < ones; i++) System.out.print("1");
        System.out.println(second);
    }
}