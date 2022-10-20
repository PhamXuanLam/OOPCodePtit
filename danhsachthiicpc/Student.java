package danhsachthiicpc;

import java.util.ArrayList;

public class Student implements Comparable<Student> {
    private Team team;
    private String code, name, code_team;
    public Student(){}
    public Student(int n, String name, String code_team, ArrayList<Team> list) {
        this.code = "C" + String.format("%03d", n);
        this.name = name;
        this.code_team = code_team;
        this.team = solveTeam(list);
    }
    private Team solveTeam(ArrayList<Team> list) {
        int x = 0;
        for(int i = 0; i < list.size(); i++) {
            if(code_team.equals(list.get(i).getCode())) {
                x = i;
                break;
            }
        }
        return list.get(x);
    } 
    @Override
    public String toString() {
        return code + " " + name + " " + team.getName() + " " + team.getSchool();
    }
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
