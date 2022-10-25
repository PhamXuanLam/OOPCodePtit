package quanlykhachsan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("DATA.in"));
        int n1 = Integer.parseInt(sc.nextLine());
        ArrayList<Room> a1 = new ArrayList<>();
        for(int i = 0; i < n1; i++) {
            Room room = new Room(sc.nextLine());
            a1.add(room);
        }
        int n2 = Integer.parseInt(sc.nextLine());
        ArrayList<Client> a2 = new ArrayList<>();
        for(int i = 0; i < n2; i++) {
            Client client = new Client(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), a1);
            a2.add(client);
        }
        Collections.sort(a2);
        for(Client i : a2) {
            System.out.println(i);
        }
    }
}
