package Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class So0Va9 {
    private static int[] initialization() {
        Queue<Integer> q = new LinkedList<>();
        int[] location = new int[101];
        int[] res = new int[101];
        int loop = 0;
        q.add(9);
        while (loop < 100) {
            int tmp =  q.poll();
            for(int i = 1; i <= 100; i++) {
                if(location[i] == 0 && tmp % i == 0) {
                    location[i] = 1;
                    res[i] = tmp;
                    loop++;
                }
            }
            q.add(tmp*10);
            q.add(tmp*10 + 9);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] res = initialization();
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            System.out.println(res[n]);
        }
        sc.close();
    }
}
