import java.util.ArrayList;
import java.util.Scanner;

// codeforces.com/problemset/problem/1263/B

public class PINCodes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int k = 0;
            ArrayList<String> v = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                String next = s.next();
                if(v.contains(next)) k++;
                v.add(next);
            }
            for(int i = 0; i < n; i++) {
                String temp = v.remove(i);
                if(v.contains(temp)) {
                    char[] a = temp.toCharArray();
                    label:
                    for(int d = 0; d < 4; d++) {
                        char tempC = a[d];
                        for(int j = 48; j <= 57; j++) {
                            a[d] = (char) j;
                            String str = new String(a);
                            if(!v.contains(str)) {
                                v.add(i, str);
                                break label;
                            }
                        }
                        a[d] = tempC;
                    }
                }
                else v.add(i, temp);
            }
            System.out.println(k);
            for(String ss : v) System.out.println(ss);
        }
    }
}