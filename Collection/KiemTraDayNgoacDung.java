package Collection;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDayNgoacDung {
    private static String check(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(st.empty() || s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                st.push(s.charAt(i));
            }
            else {
                if(st.peek() == '{' && s.charAt(i) == '}') st.pop();
                else if(st.peek() == '[' && s.charAt(i) == ']') st.pop();
                else if(st.peek() == '(' && s.charAt(i) == ')') st.pop();
                else st.push(s.charAt(i));
            }
        } 
        return st.empty() ? "YES" : "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            System.out.println(check(s));
        }
        sc.close();
    }
}
