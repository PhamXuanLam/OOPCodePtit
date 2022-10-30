package Collection;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraVietDungQuyTac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            Stack<Character> st = new Stack<>();
            boolean run = true;
            while(sc.hasNextLine()) {
                String x = sc.nextLine();
                for(int i = 0; i < x.length(); i++) {
                    if(x.charAt(i) == '.') run = false;
                    else if(x.charAt(i) == '(' || x.charAt(i) == '[' || x.charAt(i) == '{') {
                        st.push(x.charAt(i));
                    }
                    else if((x.charAt(i) == ')' && st.peek() == '(') || (x.charAt(i) == ']' && st.peek() == '[') || (x.charAt(i) == '}' && st.peek() == '{')) {
                        st.pop();
                    }
                }
                if(run == false) break;
            }
            System.out.println(st.empty() ? "YES" : "NO"); 
        }
        sc.close();
    }
}
