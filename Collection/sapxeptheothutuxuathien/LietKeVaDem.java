package Collection.sapxeptheothutuxuathien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class LietKeVaDem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
            int n = sc.nextInt();
            for(int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if(map.containsKey(x)) {
                    map.put(x, map.get(x) + 1);
                }
                else map.put(x, 1);
            }
            ArrayList<Pair<Integer, Integer>> a = new ArrayList<>();
            for(Integer i : map.keySet()) {
                a.add(new Pair<Integer,Integer>(i, map.get(i)));
            }
            Collections.sort(a);
            for(Pair<Integer, Integer> i : a) {
                for(int j = 0; j < i.getValue(); j++) {
                    System.out.print(i.getKey() + " ");
                }
            }
            System.out.println();
        } 
        sc.close();
        
    }
}
