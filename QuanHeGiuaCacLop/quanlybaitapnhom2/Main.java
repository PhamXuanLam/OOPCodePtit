package QuanHeGiuaCacLop.quanlybaitapnhom2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> a = new ArrayList<>();
        String s = sc.nextLine();
        String[] tmp = s.split("\\s+");
        int n = Integer.parseInt(tmp[0]);
        int m = Integer.parseInt(tmp[1]);
        for(int i = 0; i < n; i++) {
            Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(student);
        }
        ArrayList<Topic> b = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            Topic topic = new Topic(i + 1, sc.nextLine());
            b.add(topic);
        }
        Collections.sort(a);
        for(Student i : a) {
            for(Topic j : b) {
                if(i.getTeam().equals(j.getCode())) {
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }
        sc.close();
    }
}
