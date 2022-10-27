package sapxeplichthi;

import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class TestSchedule implements Comparable<TestSchedule> {
    private Exam exam;
    private ExamTime examTime;
    private String codeExamTime, codeExam, team, amount;
    public TestSchedule(String s, ArrayList<Exam> a, ArrayList<ExamTime> b) {
        String[] tmp = s.split("\\s+");
        this.codeExamTime = tmp[0];
        this.codeExam = tmp[1];
        this.team = tmp[2];
        this.amount = tmp[3];
        this.exam = solveExam(a);
        this.examTime = solveExamTime(b);
    }
    private Exam solveExam(ArrayList<Exam> a) {
        int x = 0;
        for(int i = 0; i < a.size(); i++) {
            if(codeExam.equals(a.get(i).getCode())) {
                x = i;
            }
        }
        return a.get(x);
    } 
    private ExamTime solveExamTime(ArrayList<ExamTime> a) {
        int x = 0;
        for(int i = 0; i < a.size(); i++) {
            if(codeExamTime.equals(a.get(i).getCode())) {
                x = i;
            }
        }
        return a.get(x);
    } 
    @Override
    public String toString() {
        return new SimpleDateFormat("dd/MM/yyyy").format(examTime.getTestDay()) + " " + examTime.getTestTime() +
        " " + examTime.getRoom() + " " + exam.getName() + " " + team + " " + amount;
    }
    @Override
    public int compareTo(TestSchedule o) {
        if(this.examTime.getTestDay().equals(o.examTime.getTestDay())) {
            if(this.examTime.getTestTime().equals(o.examTime.getTestTime())) {
                return this.codeExamTime.compareTo(o.codeExamTime);
            }
            return this.examTime.getTestTime().compareTo(o.examTime.getTestTime());
        }
        return this.examTime.getTestDay().compareTo(o.examTime.getTestDay());
    }
}
