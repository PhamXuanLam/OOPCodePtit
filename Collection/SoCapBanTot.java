package Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoCapBanTot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            String s = sc.next();
            if(q.size() <= k) {
                if(q.peek() != null && q.peek() == s.length()) {
                    cnt++;
                }
                q.add(s.length());
            }
            if(q.size() > k) q.poll();
        }
        System.out.println(cnt);
        sc.close();
    }
}