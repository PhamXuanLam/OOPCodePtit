package QuanHeGiuaCacLop.bangtinhgiochuan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Subject> a1 = new ArrayList<>();
        ArrayList<Teacher> a2 = new ArrayList<>();
        ArrayList<Time> a3 = new ArrayList<>();
        HashMap<String, Double> map = new HashMap<>();
        int n1 = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n1; i++) {
            Subject subject = new Subject(sc.nextLine());
            a1.add(subject);
        }
        int n2 = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n2; i++) {
            Teacher teacher = new Teacher(sc.nextLine());
            a2.add(teacher);
        } 
        int n3 = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n3; i++) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            if(map.containsKey(tmp[0])) {
                map.put(tmp[0], map.get(tmp[0]) + Double.parseDouble(tmp[2]));
            }
            else {
                map.put(tmp[0], Double.parseDouble(tmp[2]));
                Time time = new Time(tmp[0], tmp[1], Double.parseDouble(tmp[2]), a1, a2);
                a3.add(time);
            }
        }
        for(Time i : a3) {
            i.setTime(map.get(i.getCodeTeacher()));
            System.out.println(i);
        }
        sc.close();
    }
}