package Collection;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BienDoiST {
    private static int solve(int start, int target) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(start, 0);
        while(!q.isEmpty()) {
            int tmp = q.poll();
            if(tmp == target) return map.get(tmp);
            if(!map.containsKey(tmp - 1) && tmp - 1 > 0) {
                map.put(tmp - 1, map.get(tmp) + 1);
                q.add(tmp - 1);
            }
            if(!map.containsKey(tmp * 2) && tmp < target) {
                map.put(tmp * 2, map.get(tmp) + 1);
                q.add(tmp * 2);
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int start = sc.nextInt();
            int target = sc.nextInt();
            System.out.println(solve(start, target));
        }
        sc.close();
    }
}
