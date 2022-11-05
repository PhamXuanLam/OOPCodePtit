package XauKyTu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class DayConTangDan {
    private static int n;
    private static int[] a = new int[20];
    private static int[] b = new int[20];
    private static TreeSet<String> set = new TreeSet<>();
    private static boolean check(int[] a, int n) {
        for(int i = 0; i < n - 1; i++) {
            if(a[i] > a[i + 1]) return false;
        }
        return true;
    } 
    private static void solve() {
        int[] tmp = new int[20];
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(b[i] == 1) {
                tmp[cnt] = a[i];
                cnt++;
            }
        }
        if(cnt > 1) {
            String res = "";
            if(check(tmp, cnt)) {
                for(int i = 0; i < cnt; i++) {
                    res += Integer.toString(tmp[i]) + " ";
                }
                set.add(res);
            }
        }
    }
    private static void Try(int i) {
        for(int j = 0; j <= 1; j++) {
            b[i] = j;
            if(i == n - 1) {
                solve();
            }
            else Try(i + 1);
        }
    }
    public static void main(String[] args) throws IOException, FileNotFoundException{
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Try(0);
        for(String i : set) {
            System.out.println(i);
        }
    }
}
