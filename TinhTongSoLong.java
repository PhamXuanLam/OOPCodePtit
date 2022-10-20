import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TinhTongSoLong {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(sc.hasNext()) {
            String s = sc.next();
            try {
                long x = Long.parseLong(s);
                sum += x;
            } catch (Exception e) {
            }
            try {
                int x = Integer.parseInt(s);
                sum -= x;
            } catch (Exception e) {
            }
        }
        System.out.println(sum);
    }
}
