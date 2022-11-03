package XauKyTu;

import java.util.Scanner;
import java.util.TreeSet;

public class TapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            String s = sc.nextLine();
            TreeSet<String> set1 = new TreeSet<>();
            TreeSet<String> set2 = new TreeSet<>();
            String[] tmp = s.split("\\s+");
            for(String i : tmp) {
                set1.add(i);
            }
            s = sc.nextLine();
            tmp = s.split("\\s+");
            for(String i : tmp) {
                set2.add(i);
            }
            for(String i : set1) {
                if(!set2.contains(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
