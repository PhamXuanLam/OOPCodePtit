package luyentap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class So2UuThe {
    private static boolean check(String s) {
        int cnt1 = 0, cnt2 = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '2') cnt1++;
            else cnt2++;
            if(cnt1 > (s.length()/2)) return true;
            if(cnt2 > (s.length()/2)) return false; 
        }
        return false;
    }
    private static void testCase(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");
        q.add("2");
        while(true) {
            String tmp = q.poll();
            if(check(tmp)) {
                System.out.print(tmp + " ");
                n--;
            }
            if(n == 0) return;
            q.add(tmp + "0");
            q.add(tmp + "1");
            q.add(tmp + "2");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            testCase(n);
            System.out.println();
        }
        sc.close();
    }
}
