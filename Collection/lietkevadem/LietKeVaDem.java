package Collection.lietkevadem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class LietKeVaDem {
    private static boolean check(String s) {
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) < s.charAt(i - 1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        while(sc.hasNext()) {
            String x = sc.next();
            if(check(x)) {
                if(map.containsKey(x)) {
                    map.put(x, map.get(x) + 1);
                }
                else map.put(x, 1);
            }
        }
        sc.close();
        ArrayList<Pair<String, Integer>> a = new ArrayList<>();
        for(String i : map.keySet()) {
            a.add(new Pair<String,Integer>(i, map.get(i)));
        }
        Collections.sort(a);
        for(Pair<String, Integer> i : a) {
            System.out.println(i);
        }
    }
}
