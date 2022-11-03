package QuanHeGiuaCacLop.quanlybaitapnhom2;

public class Student implements Comparable<Student> {
    private String code, name, numberPhone, team;
    public Student(String code, String name, String numberPhone, String team) {
        this.code = code;
        this.name = name;
        this.numberPhone = numberPhone;
        this.team = team;
    }
    public String getTeam() {
        return team;
    }
    @Override
    public String toString() {
        return code + " " + name + " " + numberPhone + " " + team;
    }
    @Override
    public int compareTo(Student o) {
        return this.code.compareTo(o.code);
    }
}
