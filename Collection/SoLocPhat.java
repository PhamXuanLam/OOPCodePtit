package Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class SoLocPhat {
    private static void solve(int n) {
        Queue<String> q = new LinkedList<>();
        Stack<String> st = new Stack<>();
        q.add("6");
        q.add("8");
        while(true) {
            String tmp = q.poll();
            if(tmp.length() > n) break; 
            st.push(tmp);
            q.add(tmp + "6");
            q.add(tmp + "8");
        }
        System.out.println(st.size());
        while(!st.empty()) {
            System.out.print(st.pop() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            solve(n);
        }
        sc.close();
    }
}