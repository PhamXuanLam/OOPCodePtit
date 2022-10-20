package thuctapcoso;

public class Topic {
    private String code, name_teacher, name_topic;
    public Topic(){}
    public Topic(int n, String name_teacher, String name_topic) {
        this.code = "DT" + String.format("%03d", n);
        this.name_teacher = name_teacher;
        this.name_topic = name_topic;
    }
    public String getCode() {
        return code;
    }
    public String getName_teacher() {
        return name_teacher;
    }
    public String getName_topic() {
        return name_topic;
    }
}
