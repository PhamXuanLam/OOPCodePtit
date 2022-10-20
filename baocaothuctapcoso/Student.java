package baocaothuctapcoso;

public class Student {
    private String code, name, phone, email;
    public Student(){}
    public Student(String code, String name, String phone, String email) {
        this.code = code;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
}
