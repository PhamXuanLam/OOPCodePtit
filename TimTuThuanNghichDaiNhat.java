import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TimTuThuanNghichDaiNhat {
    private static boolean check(String s) {
        for(int i = 0; i <= s.length() / 2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> a = new LinkedHashMap<>();
        int max = 0;
        while(sc.hasNext()) {
            String s = sc.next();
            if(check(s)) {
                if(!a.containsKey(s)) {
                    a.put(s, 1);
                }
                else {
                   a.put(s, a.get(s) + 1); 
                }
                max = Math.max(max, s.length());
            }
        }
        for(String s : a.keySet()) {
            if(s.length() == max) {
                System.out.println(s + " " + a.get(s));
            }
        }
        sc.close();
    }
}