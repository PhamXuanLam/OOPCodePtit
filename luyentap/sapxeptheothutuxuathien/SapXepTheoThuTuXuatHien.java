package luyentap.sapxeptheothutuxuathien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class SapXepTheoThuTuXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Pair<Integer, Integer>> a = new ArrayList<>();
            LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
            for(int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if(map.containsKey(x)) {
                    map.put(x, map.get(x) + 1);
                }
                else {
                    map.put(x, 1);
                }
            }
            for(Integer i : map.keySet()) {
                a.add(new Pair<Integer,Integer>(i, map.get(i)));
            }
            Collections.sort(a);
            for(Pair<Integer, Integer> i : a) {
                for(int j = 0; j < i.getSecond(); j++) {
                    System.out.print(i.getFirst() + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
