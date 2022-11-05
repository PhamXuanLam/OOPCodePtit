package XauKyTu;

import java.util.Scanner;

public class SoUuThe {
    private static String check(String s) {
        if(s.charAt(0) == '0') return "INVALID";
        int n = s.length();
        int odd = 0, even = 0;
        for(int i = 0; i < n; i++) {
            if(!Character.isDigit(s.charAt(i))) return "INVALID";
            if((s.charAt(i) - '0') % 2 == 0) even++;
            else odd++;
        }
        if((n % 2 == 0 && even > odd) || (n % 2 == 1 && even < odd)) return "YES";
        else return "NO";
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
