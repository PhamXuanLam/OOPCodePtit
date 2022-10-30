package Collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QuayHinhVuong {
    private static String turn1(String s) {
        StringBuilder tmp = new StringBuilder("");
        tmp.append(s.charAt(3));
        tmp.append(s.charAt(0));
        tmp.append(s.charAt(2));
        tmp.append(s.charAt(4));
        tmp.append(s.charAt(1));
        tmp.append(s.charAt(5));
        return tmp.toString();
    }
    private static String turn2(String s) {
        StringBuilder tmp = new StringBuilder("");
        tmp.append(s.charAt(0));
        tmp.append(s.charAt(4));
        tmp.append(s.charAt(1));
        tmp.append(s.charAt(3));
        tmp.append(s.charAt(5));
        tmp.append(s.charAt(2));
        return tmp.toString();
    }
    private static int solve(String start, String target) {
        Queue<String> q = new LinkedList<>();
        HashSet<String> vs = new HashSet<>();
        q.add(start);
        vs.add(start);
        
        int level = 0;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                String tmp = q.poll();
                if(tmp.equals(target)) return level;
                String s1 = turn1(tmp);
                String s2 = turn2(tmp);
                if(s1.equals(target)||s2.equals(target)) return level + 1;
                if(!vs.contains(s1)){
                    vs.add(s1);
                    q.add(s1);
                }
                if(!vs.contains(s2)){
                    vs.add(s2);
                    q.add(s2);
                }
            }
            level++;
        }
        return level;
    }
    private static void testCase(String s1, String s2) {
        String start = s1.replace(" ", "");
        String target = s2.replace(" ", "");
        System.out.println(solve(start, target));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            testCase(s1, s2);
        }
        sc.close();
    }
}
