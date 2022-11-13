package luyentap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoMayManTiepTheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        Queue<String> q = new LinkedList<>();
        q.add("4");
        q.add("7");
        long sum = 0;
        while(a <= b) {
            int x = Integer.parseInt(q.peek());
            if(a <= x) {
                a++;
                sum += x;
            }
            else {
                q.poll();
                x = Integer.parseInt(q.peek());
                q.add(q.peek() + "4");
                q.add(q.peek() + "7");
            }
        }
        System.out.println(sum);
    }
}
