package thuctapcoso;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        ArrayList<Student> a = new ArrayList<>();
        Scanner sc2 = new Scanner(new File("DETAI.in"));
        ArrayList<Topic> b = new ArrayList<>();
        Scanner sc3 = new Scanner(new File("NHIEMVU.in"));
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
        int p = Integer.parseInt(sc3.next());
        for(int i = 0; i < p; i++) {
            Task task = new Task(sc3.next(), sc3.next(), a, b);
            list.add(task);
        }
        Collections.sort(list);
        for(Task i : list) {
            System.out.println(i);
        }
    }
}
