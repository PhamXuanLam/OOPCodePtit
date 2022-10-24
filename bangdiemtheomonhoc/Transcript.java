package bangdiemtheomonhoc;

import java.util.ArrayList;

public class Transcript implements Comparable<Transcript> {
    private Subject subject;
    private Student student;
    private String codeStudent, codeSubject;
    private Double scores;
    public Transcript(String s, ArrayList<Student> a, ArrayList<Subject> b) {
        String[] tmp = s.split("\\s+");
        this.codeStudent = tmp[0];
        this.codeSubject = tmp[1];
        this.scores = Double.parseDouble(tmp[2]);
        this.student = solveStudent(a);
        this.subject = solveSubject(b);
    }
    public String getCodeSubject() {
        return subject.getCode();
    }
    public String getNameSubject() {
        return subject.getName();
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
        String tmp;
        if(scores.intValue() - scores == 0) tmp = String.format("%.0f", scores);
        else tmp = String.format("%.1f", scores);
        return codeStudent + " " + student.getName() + " " + student.getClassName() +" " + tmp;
    }
    @Override
    public int compareTo(Transcript o) {
        if(o.scores > this.scores) return 1;
        else if(o.scores < this.scores) return -1;
        else return this.codeStudent.compareTo(o.codeStudent);
    }
}
