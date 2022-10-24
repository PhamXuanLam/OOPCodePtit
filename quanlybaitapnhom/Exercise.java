package quanlybaitapnhom;

public class Exercise {
    private String name;
    private int order;
    public Exercise(int n, String name) {
        this.order = n;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getOrder() {
        return order;
    }
}
