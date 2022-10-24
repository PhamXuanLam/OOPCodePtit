package quanlybaitapnhom;

public class Student {
    private String code, name, numberPhone;
    public Student(String code, String name, String numberPhone) {
        this.code = code;
        this.name = chuanHoa(name);
        this.numberPhone = numberPhone;
    }
    private String chuanHoa(String s) {
        String[] tmp = s.trim().split("\\s+");
        String res = "";
        for(String i : tmp) {
            res += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        return res.trim();
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public String getNumberPhone() {
        return numberPhone;
    }
}
