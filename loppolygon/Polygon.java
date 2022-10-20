package loppolygon;

public class Polygon {
    private Point[] p;
    private String area;
    public Polygon(Point[] p) {
        this.p = p;
        this.area = solveArea();
    }
    private String solveArea() {
        double s = 0;
        for(int i = 1; i < p.length - 1; i++) {
            Triangle tmp = new Triangle(p[0], p[i], p[i + 1]);
            s += tmp.area();
        }
        return String.format("%.3f", s);
    }
    public String getArea() {
        return area;
    }
}
