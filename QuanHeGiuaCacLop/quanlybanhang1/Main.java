package QuanHeGiuaCacLop.quanlybanhang1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Client> a1 = new ArrayList<>();
        ArrayList<Merchandise> a2 = new ArrayList<>();
        ArrayList<Receipt> a3 = new ArrayList<>();
        int n1 = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n1; i++) {
            Client client = new Client(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a1.add(client);
        }
        int n2 = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n2; i++) {
            Merchandise merchandise = new Merchandise(i + 1, sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            a2.add(merchandise);
        } 
        int n3 = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n3; i++) {
            Receipt receipt = new Receipt(i + 1, sc.nextLine(), a1, a2);
            a3.add(receipt);
        }
        for(Receipt i : a3) {
            System.out.println(i);
        }
        sc.close();
    }
}
