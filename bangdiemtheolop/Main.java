package bangdiemtheolop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("MONHOC.in"));
        Scanner sc3 = new Scanner(new File("BANGDIEM.in"));
        ArrayList<Student> a1 = new ArrayList<>();
        ArrayList<Subject> a2 = new ArrayList<>();
        ArrayList<Transcript> a3 = new ArrayList<>();
        int n1 = Integer.parseInt(sc1.nextLine());
        for(int i = 0; i < n1; i++) {
            Student student = new Student(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            a1.add(student);
        }
        int n2 = Integer.parseInt(sc2.nextLine());
        for(int i = 0; i < n2; i++) {
            Subject subject = new Subject(sc2.nextLine(), sc2.nextLine(), Integer.parseInt(sc2.nextLine()));
            a2.add(subject);
        } 
        int n3 = Integer.parseInt(sc3.nextLine());
        for(int i = 0; i < n3; i++) {
            Transcript Transcript = new Transcript(sc3.nextLine(), a1, a2);
            a3.add(Transcript);
        }
        Collections.sort(a3);
        int t = Integer.parseInt(sc3.nextLine());
        while(t-- > 0) {
            String s = sc3.nextLine();
            for(Student i : a1) {
                if(s.equals(i.getClassName())) {
                    System.out.println("BANG DIEM lop " + i.getClassName() + ":");
                    break;
                }
            }
            for(Transcript i : a3) {
                if(i.getClassName().equals(s)) {
                    System.out.println(i);
                }
            }
        }
    }
}