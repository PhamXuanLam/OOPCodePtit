package quanlybaitapnhom;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("BAITAP.in"));
        Scanner sc3 = new Scanner(new File("NHOM.in"));
        ArrayList<Student> a1 = new ArrayList<>();
        ArrayList<Exercise> a2 = new ArrayList<>();
        ArrayList<Team> a3 = new ArrayList<>();
        int n1 = Integer.parseInt(sc1.nextLine());
        for(int i = 0; i < n1; i++) {
            Student student = new Student(sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            a1.add(student);
        }
        int n2 = Integer.parseInt(sc2.nextLine());
        for(int i = 0; i < n2; i++) {
            Exercise exercise = new Exercise(i + 1, sc2.nextLine());
            a2.add(exercise);
        } 
        for(int i = 0; i < n1; i++) {
            Team team = new Team(sc3.nextLine(), a1, a2);
            a3.add(team);
        }
        Collections.sort(a3);
        for(Team i : a3) {
            System.out.println(i);
        }
    }
}
