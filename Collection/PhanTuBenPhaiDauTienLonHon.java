package Collection;
import java.util.Scanner;
import java.util.Stack;

public class PhanTuBenPhaiDauTienLonHon {
    private static void solve(int[] a, int n) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        res[n - 1] = -1;
        st.push(a[n - 1]);
        for(int i = n - 2; i >= 0; i--) {
            while(!st.empty() && a[i] >= st.peek()) st.pop();
            if(st.empty()) res[i] = -1;
            else res[i] = st.peek();
            st.push(a[i]);
        }
        for(int i : res) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            solve(a, n);
        }
        sc.close();
    }
}