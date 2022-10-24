package tinhgiochuan;

import java.util.ArrayList;

public class Time {
    private Subject subject;
    private Teacher teacher;
    private String codeTeacher, codeSubject;
    private double time;
    public Time(String s, ArrayList<Subject> a, ArrayList<Teacher> b) {
        String[] tmp = s.split("\\s+");
        this.codeTeacher = tmp[0];
        this.codeSubject = tmp[1];
        this.time = Double.parseDouble(tmp[2]);
        this.subject = solveSubject(a);
        this.teacher = solveTeacher(b);

    }
    public Double getTime() {
        return time;
    }
    public void setTime(double x) {
        time = x;
    }
    public String getCodeTeacher() {
        return codeTeacher;
    }
    private Subject solveSubject(ArrayList<Subject> a) {
        int x = 0;
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i).getCode().equals(codeSubject)) {
                x = i;
                break;
            }
        }
        return a.get(x);
    }
    private Teacher solveTeacher(ArrayList<Teacher> a) {
        int x = 0;
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i).getCode().equals(codeTeacher)) {
                x = i;
                break;
            }
        }
        return a.get(x);
    }
    @Override
    public String toString() {
        return teacher.getName() + " " + String.format("%.2f", time);
    }
}
