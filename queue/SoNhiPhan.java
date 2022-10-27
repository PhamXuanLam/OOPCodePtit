package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            xuly(n);
        }
        sc.close();
    }
    private static void xuly(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(n -- > 0) {
            String tmp = q.poll();
            System.out.println(tmp + " ");
            q.add(tmp + "0");
            q.add(tmp + "1");
        }
        System.out.println();
    }
}
