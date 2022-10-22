package hoadon1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        Scanner sc1 = new Scanner(new File("DATA1.in"));
        Scanner sc2 = new Scanner(new File("DATA2.in"));
        int n1 = Integer.parseInt(sc1.nextLine());
        ArrayList<Product> a1 = new ArrayList<>();
        for(int i = 0; i < n1; i++) {
            Product product = new Product(sc1.nextLine(), sc1.nextLine(), Integer.parseInt(sc1.nextLine()), Integer.parseInt(sc1.nextLine()));
            a1.add(product);
        }
        int n2 = Integer.parseInt(sc2.nextLine());
        ArrayList<Receipt> a2 = new ArrayList<>();
        for(int i = 0; i < n2; i++) {
            Receipt receipt = new Receipt(i + 1, sc2.next(), Integer.parseInt(sc2.next()), a1);
            a2.add(receipt);
        }
        for(Receipt i : a2) {
            System.out.println(i);
        }
    }
}
