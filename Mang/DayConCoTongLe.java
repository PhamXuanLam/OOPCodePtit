package Mang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class DayConCoTongLe {
    private static int n;
    private static int[] a = new int[15];
    private static int[] b = new int[15];
    private static TreeSet<String> set = new TreeSet<>();
    private static boolean check(int s, int[] x, int cnt) {
        if(s % 2 == 0) return false;
        if(cnt == n) return false;
        for(int i = 0; i < cnt - 1; i++) {
            if(a[i] < a[i + 1]) return false;
        } 
        return true;
    }
    private static void solve() {
        int sum = 0;
        int[] tmp = new int[15];
        int cnt = 0;
        String res = "";
        for(int i = 0; i < n; i++) {
            if(b[i] == 1) {
                sum += a[i];
                tmp[cnt] = a[i];
                res += Integer.toString(a[i]) + " ";
            }
        }
        if(check(sum, tmp, cnt)) {
            set.add(res);
        }
    }
    private static void Try(int i) {
        for(int j = 0; j <= 1; j++) {
            b[i] = j;
            if(i == n - 1) {
                solve();
            }
            else {
                Try(i + 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            set.clear();
            n = sc.nextInt();
            ArrayList<Integer> c = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                c.add(sc.nextInt());
            }
            Collections.sort(c);
            StringBuilder tmp = new StringBuilder();
            for(int i = 0; i < n; i++) {
                tmp.append(c.get(i));
            }
            String s = tmp.reverse().toString();
            for(int i = 0; i < s.length(); i++) {
                a[i] = s.charAt(i) - '0';
            }
            Try(0);
            for(String i : set) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
