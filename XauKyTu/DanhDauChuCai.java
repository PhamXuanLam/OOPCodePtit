package XauKyTu;

import java.util.HashSet;
import java.util.Scanner;

public class DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        sc.close();
        System.out.println(set.size());
    }
}
