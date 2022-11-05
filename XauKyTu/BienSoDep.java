package XauKyTu;

import java.util.Scanner;

public class BienSoDep {
    private static boolean tang(String s) {
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) >= s.charAt(i + 1)) return false;
        }
        return true;
    }
    private static boolean bangNhau(String s) {
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) != s.charAt(i + 1)) return false;
        }
        return true;
    }
    private static boolean bangNhau2(String s) {
        if(s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(3) == s.charAt(4)) return true;
        return false;
    }
    private static boolean locPhat(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '6' && s.charAt(i) != '8') return false;
        }
        return true;
    }
    private static String check(String s) {
        if(tang(s) || bangNhau(s) || bangNhau2(s) || locPhat(s)) return "YES";
        else return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            String tmp = s.substring(5, 8) + s.substring(9);
            System.out.println(check(tmp));
        }
        sc.close();
    }
}
