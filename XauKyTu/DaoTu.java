package XauKyTu;

import java.util.Scanner;

public class DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            for(String i : tmp) {
                System.out.print(new StringBuilder(i).reverse().toString() + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
