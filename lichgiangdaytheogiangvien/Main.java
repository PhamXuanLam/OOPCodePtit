package lichgiangdaytheogiangvien;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("LICHGD.in"));
        int n1 = Integer.parseInt(sc1.nextLine());
        ArrayList<Subject> a1 = new ArrayList<>();
        for(int i = 0; i < n1; i ++) {
            Subject subject = new Subject(sc1.nextLine(), sc1.nextLine(), Integer.parseInt(sc1.nextLine()));
            a1.add(subject);
        }
        int n2 = Integer.parseInt(sc2.nextLine());
        ArrayList<Schedule> a2 = new ArrayList<>();
        for(int i = 0; i < n2; i++) {
            Schedule schedule = new Schedule(i + 1, sc2.nextLine(), Integer.parseInt(sc2.nextLine()), Integer.parseInt(sc2.nextLine()), sc2.nextLine(), sc2.nextLine(), a1);
            a2.add(schedule);
        }
        Collections.sort(a2);
        String s = sc2.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN " + s + ":");
        for(Schedule i : a2) {
            if(i.getNameTeacher().equals(s)) {
                System.out.println(i);
            }
        }
    }
}
