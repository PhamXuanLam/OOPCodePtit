package luyentap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoNguyenThuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("4");
            q.add("5");
            while(true){
                String tmp = q.poll();
                System.out.print(doixung(tmp) + " ");
                n--;
                if(n <= 0) break;
                q.add(tmp + "4");
                q.add(tmp + "5");
            }
            System.out.println();
        }
        sc.close();
    }
    
    private static String doixung(String s){
        StringBuilder ans = new StringBuilder(s);
        ans.reverse();
        return s + ans.toString();
    }
}

