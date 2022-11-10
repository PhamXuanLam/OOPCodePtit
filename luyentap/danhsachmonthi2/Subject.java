package luyentap.danhsachmonthi2;

public class Subject implements Comparable<Subject>{
    private String code, name, type;
    public Subject(String code, String name, String type) {
        this.code = code;
        this.name = name;
        this.type = type;
    }
    @Override
    public String toString() {
        return code + " " + name + " " + type;
    }
    @Override
    public int compareTo(Subject o) {
        return this.code.compareTo(o.code);
    }
}
