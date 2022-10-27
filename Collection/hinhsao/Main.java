package Collection.hinhsao;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Canh> x = new ArrayList<>();
        for(int i = 0; i < n - 1; i++) {
            x.add(new Canh(sc.nextInt(), sc.nextInt()));
        }
        DoThi a =  new DoThi(x);
        sc.close();
        System.out.println(a.isHinhSao() ? "Yes" : "No");
    }
}
