package bangdiemtheolop;

import java.util.ArrayList;

public class Transcript implements Comparable<Transcript> {
    private Subject subject;
    private Student student;
    private String codeStudent, codeSubject, scores;
    public Transcript(String s, ArrayList<Student> a, ArrayList<Subject> b) {
        String[] tmp = s.split("\\s+");
        this.codeStudent = tmp[0];
        this.codeSubject = tmp[1];
        this.scores = tmp[2];
        this.student = solveStudent(a);
        this.subject = solveSubject(b);
    }
    public String getCodeSubject() {
        return subject.getCode();
    }
    public String getNameSubject() {
        return subject.getName();
    }
    public String getClassName() {
        return student.getClassName();
    }
    private Student solveStudent(ArrayList<Student> a) {
        int x = 0;
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i).getCode().equals(codeStudent)) {
                x = i;
                break;
            }
        }
        return a.get(x);
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
    @Override
    public String toString() {
        return codeStudent + " " + student.getName() + " " + codeSubject + " " + subject.getName() +" " + scores;
    }
    @Override
    public int compareTo(Transcript o) {
        if(this.codeSubject.equals(o.codeSubject)) return this.codeStudent.compareTo(o.codeStudent);
        return this.codeSubject.compareTo(o.codeSubject);
    }
}
