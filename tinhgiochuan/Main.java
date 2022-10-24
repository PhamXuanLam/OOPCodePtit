package tinhgiochuan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("GIANGVIEN.in"));
        Scanner sc3 = new Scanner(new File("GIOCHUAN.in"));
        ArrayList<Subject> a1 = new ArrayList<>();
        ArrayList<Teacher> a2 = new ArrayList<>();
        ArrayList<Time> a3 = new ArrayList<>();
        Map<String, Double> res = new HashMap<>();
        int n1 = Integer.parseInt(sc1.nextLine());
        for(int i = 0; i < n1; i++) {
            Subject subject = new Subject(sc1.nextLine());
            a1.add(subject);
        }
        int n2 = Integer.parseInt(sc2.nextLine());
        for(int i = 0; i < n2; i++) {
            Teacher teacher = new Teacher(sc2.nextLine());
            a2.add(teacher);
        } 
        int n3 = Integer.parseInt(sc3.nextLine());
        for(int i = 0; i < n3; i++) {
            String s = sc3.nextLine();
            String[] tmp = s.split("\\s+");
            Time time = new Time(s, a1, a2);
            a3.add(time);
            if(res.containsKey(tmp[0])) {
                res.put(tmp[0], res.get(tmp[0]) + Double.parseDouble(tmp[2]));
            }
            else {
                res.put(tmp[0], Double.parseDouble(tmp[2]));
            }
        }
        ArrayList<String> tmp = new ArrayList<>();
        for(Time i : a3) {
            for(String j : res.keySet()) {
                if(i.getCodeTeacher().equals(j)) {
                    i.setTime(res.get(j));
                }
            }
            String s = i.toString();
            if(tmp.contains(s)) continue;
            else tmp.add(s);
        }
        for(String i : tmp) {
            System.out.println(i);
        }
    }
}