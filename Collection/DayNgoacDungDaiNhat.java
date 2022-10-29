package Collection;

import java.util.Scanner;
import java.util.Stack;

public class DayNgoacDungDaiNhat {
    private static int count(String s) {
        Stack<Integer> st = new Stack<>();
        int res = 0;
        st.push(-1);
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') st.push(i);
            else {
                st.pop();
                if(!st.empty()) {
                    res = Math.max(res, i - st.peek());
                }
                else st.push(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            System.out.println(count(s));
        }
        sc.close();
    }
}
