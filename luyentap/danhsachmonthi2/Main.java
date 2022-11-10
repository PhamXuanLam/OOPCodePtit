package luyentap.danhsachmonthi2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        HashSet<String> set = new HashSet<>();
        ArrayList<Subject> a = new ArrayList<>();
        while(sc.hasNextLine()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String s3 = sc.nextLine();
            if(set.contains(s1)) {
                set.add(s1);
            }
            else {
                set.add(s1);
                a.add(new Subject(s1, s2, s3));
            }
        }
        Collections.sort(a);
        for(Subject i : a) {
            System.out.println(i);
        }
    }
}
