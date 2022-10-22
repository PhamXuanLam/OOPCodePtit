package hoadon2;

public class Client {
    private String code, name, sex, dob, address;
    public Client(int n, String name, String sex, String dob, String address) {
        this.code = "KH" + String.format("%03d", n);
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.address = address;
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public String getSex() {
        return sex;
    }
    public String getDob() {
        return dob;
    }
    public String getAddress() {
        return address;
    }
}
