package baocaothuctapcoso;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        ArrayList<Student> a = new ArrayList<>();
        Scanner sc2 = new Scanner(new File("DETAI.in"));
        ArrayList<Topic> b = new ArrayList<>();
        Scanner sc3 = new Scanner(new File("HOIDONG.in"));
        ArrayList<Task> list = new ArrayList<>();
        int n = Integer.parseInt(sc1.nextLine());
        for(int i = 0; i < n; i++) {
            Student student = new Student(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            a.add(student);
        }
        int m = Integer.parseInt(sc2.nextLine());
        for(int i = 0; i < m; i++) {
            Topic topic = new Topic(i + 1, sc2.nextLine(), sc2.nextLine());
            b.add(topic);
        }
        TreeSet<String> set = new TreeSet<>();
        int p = Integer.parseInt(sc3.next());
        for(int i = 0; i < p; i++) {
            String s1 = sc3.next(), s2 = sc3.next(), s3 = sc3.next();
            Task task = new Task(s1, s2, s3, a, b);
            list.add(task);
            set.add(s3);
        }
        Collections.sort(list);
        for(String i : set) {
            System.out.println("DANH SACH HOI DONG " + i.charAt(2) + ":");
            for(Task j : list) {
                if(i.equals(j.getCode())) {
                    System.out.println(j);
                }
            }
        }
    }
}
