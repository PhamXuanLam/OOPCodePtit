package loppolygon;

public class Triangle {
    private Point p1, p2, p3;
    public Triangle() {}
    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public double area() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        double p = (a + b + c)/2;
        double s = Math.sqrt(p*(p - a)*(p - b)*(p - c));
        return s;
    }
}
