package hoadon2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc1 = new Scanner(new File("KH.in"));
        Scanner sc2 = new Scanner(new File("MH.in"));
        Scanner sc3 = new Scanner(new File("HD.in"));
        ArrayList<Client> a1 = new ArrayList<>();
        ArrayList<Product> a2 = new ArrayList<>();
        ArrayList<Receipt> a3 = new ArrayList<>();
        int n1 = Integer.parseInt(sc1.nextLine());
        for(int i = 0; i < n1; i++) {
            Client client = new Client(i + 1, sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            a1.add(client);
        }
        int n2 = Integer.parseInt(sc2.nextLine());
        for(int i = 0; i < n2; i++) {
            Product product = new Product(i + 1, sc2.nextLine(), sc2.nextLine(), Integer.parseInt(sc2.nextLine()), Integer.parseInt(sc2.nextLine()));
            a2.add(product);
        } 
        int n3 = Integer.parseInt(sc3.nextLine());
        for(int i = 0; i < n3; i++) {
            Receipt receipt = new Receipt(i + 1, sc3.nextLine(), a1, a2);
            a3.add(receipt);
        }
        for(Receipt i : a3) {
            System.out.println(i);
        }
    }
}
