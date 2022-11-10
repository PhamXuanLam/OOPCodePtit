package Mang;

import java.util.Scanner;
import java.util.Stack;

public class LuaChonThamLam {
    private static void solve(int n, int s) {
        Stack<Integer> st = new Stack<>();
        int cnt = 0;
        String max_tmp = " ";
        while(s > 0) {
            if(s > 9) {
                st.push(9);
                s -= 9;
            }
            else {
                st.push(s);
                s = 0;
            }
            max_tmp += st.peek();
            cnt++;
        }
        if(cnt == n) {
            String max = "";
            while(!st.empty()) {
                System.out.print(st.peek());
                max = st.pop() + max;
            }
            System.out.print(" " + max);
        }
        else if(cnt > n) {
            System.out.print("-1 -1");
        }
        else {
            System.out.print(1);
            int cnt1 = cnt;
            while(cnt < n - 1) {
                System.out.print(0);
                cnt++;
            }
            System.out.print(st.pop() - 1);
            while(!st.empty()) {
                System.out.print(st.pop());
            }
            System.out.print(max_tmp);
            while(cnt1 < n) {
                System.out.print(0);
                cnt1++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        sc.close();
        if(9*n < s || n > 1 && s == 0) {
            System.out.print("-1 -1");
        }
        else if(n == 1 && s == 0) {
            System.out.print("0 0");
        }
        else solve(n, s);
    }
}
