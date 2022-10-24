package tinhgiochuan;

public class Teacher {
    private String code, name;
    public Teacher(String s) {
        String[] tmp = s.split("\\s+");
        String x = "";
        for(int i = 1; i < tmp.length; i++) {
            x += tmp[i] + " ";
        }
        this.code = tmp[0];
        this.name = x.trim();
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
}
