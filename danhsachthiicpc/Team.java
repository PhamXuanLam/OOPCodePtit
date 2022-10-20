package danhsachthiicpc;

public class Team {
    private String code, name, school;
    public Team(){}
    public Team(int n, String name, String school) {
        this.code = "Team" + String.format("%02d", n);
        this.name = name;
        this.school = school;
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public String getSchool() {
        return school;
    }
}
