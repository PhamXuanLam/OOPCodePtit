package danhsachthiicpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Team> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            Team team = new Team(i + 1, sc.nextLine(), sc.nextLine());
            a.add(team);
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Student> list = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            Student student = new Student(i + 1, sc.nextLine(), sc.nextLine(), a);
            list.add(student);
        }
        Collections.sort(list);
        for(Student i : list) {
            System.out.println(i);
        }
        sc.close();
    }
}
