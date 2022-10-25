package bangdiemtheolop;

public class Student {
    private String code, name, className, email;
    public Student(String code, String name, String className, String email) {
        this.code = code;
        this.name = chuanHoa(name);
        this.className = className;
        this.email = email;
    }
    private String chuanHoa(String s) {
        String[] x = s.trim().split("\\s+");
        String tmp = "";
        for(String i : x) {
            tmp += i.substring(0,1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        return tmp.trim();
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public String getClassName() {
        return className;
    }
    public String getEmail() {
        return email;
    }
}
