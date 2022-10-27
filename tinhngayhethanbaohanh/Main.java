package tinhngayhethanbaohanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Product> dsSP = new ArrayList<>();
        while(t-->0) dsSP.add(new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Long.parseLong(sc.nextLine()) ));
        
        t = Integer.parseInt(sc.nextLine());
        ArrayList<Client> dsKH = new ArrayList<>();
        int stt = 1;
        while(t-->0) dsKH.add(new Client(stt++, sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), dsSP));
        Collections.sort(dsKH);
        for(Client tmp : dsKH)
            System.out.println(tmp);
    }
}
