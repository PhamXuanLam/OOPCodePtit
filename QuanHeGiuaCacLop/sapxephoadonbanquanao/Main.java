package QuanHeGiuaCacLop.sapxephoadonbanquanao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = Integer.parseInt(sc.nextLine());
        ArrayList<Product> a1 = new ArrayList<>();
        for(int i = 0; i < n1; i++) {
            Product product = new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            a1.add(product);
        }
        int n2 = Integer.parseInt(sc.nextLine());
        ArrayList<Receipt> a2 = new ArrayList<>();
        for(int i = 0; i < n2; i++) {
            Receipt receipt = new Receipt(i + 1, sc.next(), Integer.parseInt(sc.next()), a1);
            a2.add(receipt);
        }
        Collections.sort(a2);
        for(Receipt i : a2) {
            System.out.println(i);
        }
        sc.close();
    }
}
