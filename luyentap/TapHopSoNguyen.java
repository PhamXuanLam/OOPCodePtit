package luyentap;

import java.util.Scanner;
import java.util.TreeSet;

public class TapHopSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Integer> a = new TreeSet<>();
        TreeSet<Integer> b = new TreeSet<>();
        for(int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        } 
        for(int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }
        for(Integer i : a) {
            if(b.contains(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for(Integer i : a) {
            if(!b.contains(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for(Integer i : b) {
            if(!a.contains(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}
