package luyentap;

import java.util.Scanner;
import java.util.Stack;

public class DanhSoThuTuCapDauNgoac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            String s = sc.nextLine();
            Stack<Integer> st = new Stack<>();
            int cnt = 1;
            String tmp = "";
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '(') {
                    st.push(cnt);
                    cnt++;
                    tmp += st.peek() + " ";
                }
                else if(s.charAt(i) == ')') {
                    tmp += st.pop() + " ";
                }
                else continue;
            }
            System.out.println(tmp);
        }
        sc.close();
    }
}
