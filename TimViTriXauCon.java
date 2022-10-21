import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TimViTriXauCon {
    private static void testCase(Scanner sc) {
        String s1 = sc.next();
        String s2 = sc.next();
        int k = 0;
        while(true) {
            k = s1.indexOf(s2, k);
            if(k == -1) break;
            System.out.printf("%d ", ++k);
        }
        System.out.println();
    }
    public static void main(String[] args) throws IOException, FileNotFoundException{
        Scanner sc = new Scanner(new File("STRING.in"));
        int t = sc.nextInt();
        while(t-- > 0) {
            testCase(sc);
        }
    }
}
