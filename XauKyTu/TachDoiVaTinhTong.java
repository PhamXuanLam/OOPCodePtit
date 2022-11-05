package XauKyTu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class TachDoiVaTinhTong {
    private static void tinh(String s) {
        String tmp = s;
        while(tmp.length() != 1) {
            BigInteger a = new BigInteger(tmp.substring(0, tmp.length()/2));
            BigInteger b = new BigInteger(tmp.substring(tmp.length()/2));
            tmp = a.add(b).toString(0);
            System.out.println(tmp);
        }
    }
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.next();
        sc.close();
        tinh(s);
    }
}
