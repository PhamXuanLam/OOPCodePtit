package XauKyTu;

import java.util.Scanner;
import java.util.Stack;

public class RutGonXauKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(st.empty()) st.push(s.charAt(i));
            else {
                if(st.peek() == s.charAt(i)) st.pop();
                else st.push(s.charAt(i));
            }
        }
        String tmp = "";
        while(!st.empty()) {
            tmp = st.pop() + tmp;
        }
        System.out.println(tmp == "" ? "Empty String" : tmp);
    }
}
