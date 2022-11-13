package luyentap.danhsachcanh;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Pair<Integer, Integer>> res = new ArrayList<>();
        int[][] a = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                if(a[i][j] == 1 && i < j) {
                    res.add(new Pair<Integer,Integer>(i + 1, j + 1));
                } 
            }
        }
        sc.close();
        for(Pair<Integer, Integer> i : res) {
            System.out.println(i);
        }
    }
}
