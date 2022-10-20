import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TongNhoNhat {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }
            Collections.sort(a);
            long x = 0, y = 0;
            for(int i = 0; i < n; i++) {
                if(i % 2 == 0) {
                    x = x*10 + a.get(i);
                }
                else {
                    y = y*10 + a.get(i);
                }
            }
            long sum = x + y;
            System.out.println(sum);
        }
    }
}
