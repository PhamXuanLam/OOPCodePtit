package Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QuanMa {
    private static int solve(String start, String target) {
        int x[] = {-1,-2,-2,-1,1,2,2,1};
        int y[] = {-2,-1,1,2,2,1,-1,-2};
        Queue<String> q = new LinkedList<>();
        q.add(start);
        int cnt = 0;
        while(!q.isEmpty()) {
            int t = q.size();
            while(t-- > 0) {
                String tmp = q.poll();
                if(tmp.equals(target)) return cnt;
                for(int i = 0; i < 8; i++) {
                    char a = (char) (x[i] + tmp.charAt(0));
                    char b = (char) (y[i] + tmp.charAt(1));
                    if(a >= 'a' && a <= 'h' && b >= '1' && b <= '8') {
                        q.add(a + "" + b);
                    }
                }
            }
            cnt++;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String start = sc.next();
            String target = sc.next();
            System.out.println(solve(start, target));
        }
        sc.close();
    }
}
