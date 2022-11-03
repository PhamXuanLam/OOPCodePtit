package QuanHeGiuaCacLop.tinhgiochuanchotunggiangvien;

public class Teacher {
    private String code, name;
    public Teacher(String s) {
        String[] tmp = s.split("\\s+");
        this.code = tmp[0];
        String x = "";
        for(int i = 1; i < tmp.length; i++) {
            x += tmp[i] + " ";
        }
        this.name = x.trim();
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
}
