package baocaothuctapcoso;

import java.util.ArrayList;

public class Task implements Comparable<Task> {
    private Student student;
    private Topic topic;
    private String code_student, code_topic, code;
    public Task(){}
    public Task(String code_student, String code_topic, String code, ArrayList<Student> a, ArrayList<Topic> b) {
        this.code_student = code_student;
        this.code_topic = code_topic;
        this.code = code;
        this.student = solveStudent(a);
        this.topic = solveTopic(b);
    }
    public String getCode() {
        return code;
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
        return  student.getCode() + " " + student.getName() + " " + topic.getName_topic() + " " + topic.getName_teacher();
    }
    @Override
    public int compareTo(Task o) {
        return this.student.getCode().compareTo(o.student.getCode());
    }
}
