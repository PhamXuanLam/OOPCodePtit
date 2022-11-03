package QuanHeGiuaCacLop.tinhgiochuanchotunggiangvien;

import java.util.ArrayList;

public class Time {
    private Subject subject;
    private Teacher teacher;
    private String codeSubject, codeTeacher;
    private String time;
    public Time(String codeTeacher, String codeSubject, String time, ArrayList<Subject> a, ArrayList<Teacher> b) {
        this.codeTeacher = codeTeacher;
        this.codeSubject = codeSubject;
        this.time = time;
        this.subject = solveSubject(a);
        this.teacher = solveTeacher(b);
    }
    public String getCodeTeacher() {
        return teacher.getCode();
    }
    private Subject solveSubject(ArrayList<Subject> a) {
        int x = 0;
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i).getCode().equals(codeSubject)) {
                x = i;
            }
        } 
        return a.get(x);
    }
    private Teacher solveTeacher(ArrayList<Teacher> a) {
        int x = 0;
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i).getCode().equals(codeTeacher)) {
                x = i;
            }
        } 
        return a.get(x);
    }
    @Override
    public String toString() {
        return subject.getName() + " " + time;
    }
}
