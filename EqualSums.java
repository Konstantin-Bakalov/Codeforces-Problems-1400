import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// codeforces.com/problemset/problem/988/C

public class EqualSums {

   static class Triple implements Comparable<Triple> {
        int sum = 0;
        int seq = 0;
        int index = 0;

        public Triple(int s, int se, int ind) {
            sum = s;
            seq = se;
            index = ind;
        }

        @Override
        public int compareTo(Triple o) {
            if(sum > o.sum) return 1;
            if(sum < o.sum) return -1;
            return 0;
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int[] sums = new int[k];
        ArrayList<ArrayList<Integer>> v = new ArrayList<>();
        ArrayList<Triple> triples = new ArrayList<>();
        for(int i = 0; i < k; i++) v.add(new ArrayList<>());
        for(int i = 0; i < k; i++) {
            int n = s.nextInt();
            for(int j = 0; j < n; j++) {
                int next = s.nextInt();
                v.get(i).add(next);
                sums[i] += next;
            }
        }
        for(int i = 0; i < k; i++) {
            for(int j = 0; j < v.get(i).size(); j++) {
                triples.add(new Triple(sums[i] - v.get(i).get(j), i, j));
            }
        }
        Collections.sort(triples);
        for(int i = 0; i < triples.size() - 1; i++) {
            if(triples.get(i).sum == triples.get(i + 1).sum &&
            triples.get(i).seq != triples.get(i + 1).seq) {
                System.out.println("YES");
                System.out.print(triples.get(i).seq + 1);
                System.out.print(" ");
                System.out.println(triples.get(i).index + 1);
                System.out.print(triples.get(i + 1).seq + 1);
                System.out.print(" ");
                System.out.println(triples.get(i + 1).index + 1);
                return;
            }
        }
        System.out.println("NO");
    }
}