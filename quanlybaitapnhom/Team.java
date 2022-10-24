package quanlybaitapnhom;

import java.util.ArrayList;

public class Team implements Comparable<Team>{
    private Student student;
    private Exercise exercise;
    private String code;
    private int order;
    public Team(String s, ArrayList<Student> a, ArrayList<Exercise> b) {
        String[] tmp = s.split("\\s+");
        this.code = tmp[0];
        this.order = Integer.parseInt(tmp[1]);
        this.student = solvStudent(a);
        this.exercise = solvExercise(b);
    }
    private Student solvStudent(ArrayList<Student> a) {
        int x = 0;
        for(int i = 0; i < a.size(); i ++) {
            if(a.get(i).getCode().equals(code)) {
                x = i;
                break;
            }
        }
        return a.get(x);
    }
    private Exercise solvExercise(ArrayList<Exercise> b) {
        int x = 0;
        for(int i = 0; i < b.size(); i ++) {
            if(b.get(i).getOrder() == order) {
                x = i;
                break;
            }
        }
        return b.get(x);
    } 
    @Override
    public String toString() {
        return code + " " + student.getName() + " " + student.getNumberPhone() + " " + order + " " + exercise.getName();
    }
    @Override
    public int compareTo(Team o) {
        return this.code.compareTo(o.code);
    }
}
