import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class TinhGiaTriBieuThuc {
    private static String op = "+-*/";
    private static boolean check(char k) {
        for(int i = 0; i < op.length(); i++) {
            if(k == op.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    private static int deg(char k) {
        if(k == '*' || k == '/') {
            return 1;
        }
        else if(k == '+' || k == '-') {
            return 2;
        }
        else return 3;
    }
    private static String toPost(String a) {
        String res = "";
        Stack<Character> st = new Stack<>();
        st.push('#');
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '(') {
                st.push(a.charAt(i));
                continue;
            } 
            else if (a.charAt(i) == ')') {
                while (st.size() > 0 && st.peek() != '(') {
                    res += st.peek();
                    st.pop();
                }
                st.pop();
                continue;
            } 
            else if (check(a.charAt(i))) {
                while (st.size() > 0 && deg(st.peek()) <= deg(a.charAt(i))) {
                    res += st.peek();
                    st.pop();
                }
                st.push(a.charAt(i));
                continue;
            }
            Long so = (long) 0, ok = (long) 0;
            while (i < a.length() && a.charAt(i) != ')' && !check(a.charAt(i))) {
                Long ss = (long) (a.charAt(i) - '0');
                i++;
                so = so * 10 + ss;
                ok = (long) 1;
            }
            if (ok == 1)
                i--;
            res += "(";
            res += Long.toString(so);
            res += ")";
        }
        while (st.size() > 0 && st.peek() != '#') {
            res += st.peek();
            st.pop();
        }
        return res;
    }
    private static Long tinh(String a) {
        Stack<Long> st = new Stack<Long>();
        int i = 0;
        while (i < a.length()) {
            if (a.charAt(i) == '(') {
                i++;
                Long so = (long)0;
                while (a.charAt(i) != ')') {
                    so = so * 10 + (a.charAt(i) - '0');
                    i++;
                }
                i++;
                st.push(so);
            } 
            else if (st.size() > 1) {
                Long tmp1 = st.peek();
                st.pop();
                Long tmp2 = st.peek();
                st.pop();
                if (a.charAt(i) == '+')
                    st.push(tmp1 + tmp2);
                else if (a.charAt(i) == '-')
                    st.push(tmp2 - tmp1);
                else if (a.charAt(i) == '*')
                    st.push(tmp1 * tmp2);
                else if (a.charAt(i) == '/')
                    st.push(tmp2 / tmp1);
                i++;
            }
        }
        return st.peek();
    }

    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("BIEUTHUC.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            String s = sc.nextLine();
            System.out.println(tinh(toPost(s)));
        }
        sc.close();
    }
}