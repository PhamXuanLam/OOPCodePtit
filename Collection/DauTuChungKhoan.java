package Collection;

import java.util.Scanner;
import java.util.Stack;

public class DauTuChungKhoan {
    private static void solve(int[] a, int n) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int []res = new int [n];
        for(int i = 0; i < n; i++) {
            while(st.peek() != -1 && a[i] >= a[st.peek()]) {
                st.pop();
            }
            res[i] = i - st.peek();
            st.push(i);
        }
        for(int i : res)
            System.out.print(i + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            solve(a, n);
        }
        System.out.println();
        sc.close();
    }
}
