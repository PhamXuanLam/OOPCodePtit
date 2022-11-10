package Mang;

import java.util.Scanner;
import java.util.TreeMap;

public class XepHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i =  0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(map.containsKey(x)) {
                map.put(x, map.get(x) + y);
            }
            else {
                map.put(x, y);
            }
        }
        sc.close();
        int res = 0;
        for(Integer i : map.keySet()) {
            if(i > res) {
                res = i + map.get(i);
            }
            else {
                res += map.get(i);
            }
        }
        System.out.println(res);
    }
}
