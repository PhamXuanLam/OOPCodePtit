package thuctapcoso;

import java.util.ArrayList;

public class Task implements Comparable<Task> {
    private Student student;
    private Topic topic;
    private String code_student, code_topic;
    public Task(){}
    public Task(String code_student, String code_topic, ArrayList<Student> a, ArrayList<Topic> b) {
        this.code_student = code_student;
        this.code_topic = code_topic;
        this.student = solveStudent(a);
        this.topic = solveTopic(b);
    }
    private Student solveStudent(ArrayList<Student> a) {
        int x = 0;
        for(int i = 0; i < a.size(); i++) {
            if(code_student.equals(a.get(i).getCode())) {
                x = i;
                break;
            }
        }
        return a.get(x);
    } 
    private Topic solveTopic(ArrayList<Topic> b) {
        int x = 0;
        for(int i = 0; i < b.size(); i++) {
            if(code_topic.equals(b.get(i).getCode())) {
                x = i;
                break;
            }
        }
        return b.get(x);
    }
    @Override 
    public String toString() {
        return student.getCode() + " " + student.getName() + " " + student.getPhone() + " " + student.getEmail() + " " + topic.getName_teacher() + " " + topic.getName_topic();
    }
    @Override
    public int compareTo(Task o) {
        return this.topic.getName_topic().compareTo(o.topic.getName_topic());
    }
}
