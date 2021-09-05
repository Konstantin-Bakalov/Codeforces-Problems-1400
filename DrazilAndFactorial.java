import java.util.*;

// codeforces.com/problemset/problem/515/C

public class DrazilAndFactorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String ss = s.next();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = ss.charAt(i) - '0';
        int[] nums = new int[10]; // 0 to 9
        for(int i = 0; i < n; i++) {
            if(a[i] == 2) nums[2]++;
            else if(a[i] == 3) nums[3]++;
            else if(a[i] == 4) {
                nums[2] += 2;
                nums[3]++;
            }
            else if(a[i] == 5) nums[5]++;
            else if(a[i] == 6) {
                nums[3]++;
                nums[5]++;
            }
            else if(a[i] == 7) nums[7]++;
            else if(a[i] == 8) {
                nums[2] += 3;
                nums[7]++;
            }
            else if(a[i] == 9) {
                nums[2]++;
                nums[3] += 2;
                nums[7]++;
            }
        }
        for(int i = 9; i >= 2; i--) {
            for(int j = 0; j < nums[i]; j++) System.out.print(i);
        }
    }
}