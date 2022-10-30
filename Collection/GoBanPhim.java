package Collection;

import java.util.Scanner;
import java.util.Stack;

public class GoBanPhim {
    private static void solve(String s) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case '<':
                    if(!st1.empty()) st2.push(st1.pop());
                    break;
                case '>':
                    if(!st2.empty()) st1.push(st2.pop());
                    break;
                case '-':
                    if(!st1.empty()) st1.pop();
                    break;
                default:
                    st1.push(s.charAt(i));
                    break;
            }
        }
        while(!st1.isEmpty()) st2.push(st1.pop());
        while(!st2.isEmpty()) System.out.print(st2.pop());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        solve(s);
        sc.close();
    }
}
