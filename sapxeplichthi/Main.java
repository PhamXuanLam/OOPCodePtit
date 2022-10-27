package sapxeplichthi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException, ParseException {
        Scanner sc1 = new Scanner(new File("MONTHI.in"));
        Scanner sc2 = new Scanner(new File("CATHI.in"));
        Scanner sc3 = new Scanner(new File("LICHTHI.in"));
        ArrayList<Exam> a1 = new ArrayList<>();
        ArrayList<ExamTime> a2 = new ArrayList<>();
        ArrayList<TestSchedule> a3 = new ArrayList<>();
        int n1 = Integer.parseInt(sc1.nextLine());
        for(int i = 0; i < n1; i++) {
            Exam exem = new Exam( sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            a1.add(exem);
        }
        int n2 = Integer.parseInt(sc2.nextLine());
        for(int i = 0; i < n2; i++) {
            ExamTime product = new ExamTime(i + 1, sc2.nextLine(), sc2.nextLine(), sc2.nextLine());
            a2.add(product);
        } 
        int n3 = Integer.parseInt(sc3.nextLine());
        for(int i = 0; i < n3; i++) {
            TestSchedule testSchedule = new TestSchedule(sc3.nextLine(), a1, a2);
            a3.add(testSchedule);
        }
        Collections.sort(a3);
        for(TestSchedule i : a3) {
            System.out.println(i);
        }
    }
}