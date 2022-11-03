package QuanHeGiuaCacLop.quanlybaitapnhom1;

public class Topic {
    private String code, name;
    public Topic(int n, String name) {
        this.code = Integer.toString(n);
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    @Override
    public String toString() {
        return "Bai tap dang ky: " + name;
    }
}
