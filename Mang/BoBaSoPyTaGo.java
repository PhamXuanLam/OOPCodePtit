package Mang;

import java.util.Arrays;
import java.util.Scanner;

public class BoBaSoPyTaGo {
    private static String solve(long[] a, int n) {
        int x = 0, z = n - 1, y = z - 1;
        while(y != 0 && a[x] + a[y] != a[z]) {
            if(a[x] + a[y] > a[z]) y--;
            else x++;
            if(x == y) {
                x = 0;
                z--;
                y = z - 1;
            }
        }
        if(y != 0 && a[x] + a[y] == a[z]) return "YES";
        else return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++) {
                long x = sc.nextLong();
                a[i] = x*x;
            }
            Arrays.sort(a);
            System.out.println(solve(a, n));
        }
        sc.close();
    }
}
