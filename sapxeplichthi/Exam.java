package sapxeplichthi;

public class Exam {
    private String code, name, form;
    public Exam(String code, String name, String form) {
        this.code = code;
        this.name = name;
        this.form = form;
    }
    public String getName() {
        return name;
    }
    public String getCode() {
        return code;
    }
    public String getForm() {
        return form;
    }
}