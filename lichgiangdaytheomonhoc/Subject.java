package lichgiangdaytheomonhoc;

public class Subject {
    private String code, name;
    private int amount;
    public Subject(String code, String name, int amount) {
        this.code = code;
        this.name = name;
        this.amount = amount;
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public int getAmount() {
        return amount;
    }
}