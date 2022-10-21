package lichgiangdaytheomonhoc;

import java.util.ArrayList;

public class Schedule implements Comparable<Schedule> {
    private Subject subject;
    private String codeTeam, codeSubject, nameTeacher, room;
    private int weekday, time;
    public Schedule(int n, String codeSubject, int weekday, int time, String nameTeacher, String room, ArrayList<Subject> list) {
        this.codeTeam = "HP" + String.format("%03d", n);
        this.codeSubject = codeSubject;
        this.weekday = weekday;
        this.time = time;
        this.nameTeacher = nameTeacher;
        this.room = room;
        this.subject = solveSubject(list);
    }
    private Subject solveSubject(ArrayList<Subject> list) {
        int x = 0;
        for(int i = 0; i < list.size(); i++) {
            if(codeSubject.equals(list.get(i).getCode())) {
                x = i;
                break;
            }
        }
        return list.get(x);
    }
    public String getCode() {
        return subject.getCode();
    }
    @Override
    public String toString() {
        return codeTeam + " " + weekday + " " + time + " " + nameTeacher + " " + room;
    }
    @Override
    public int compareTo(Schedule o) {
        if(this.weekday == o.weekday) {
            if(this.time == o.time) {
                return this.nameTeacher.compareTo(o.nameTeacher);
            }
            return this.time - o.time;
        }
        return this.weekday - o.weekday;
    }
}
 