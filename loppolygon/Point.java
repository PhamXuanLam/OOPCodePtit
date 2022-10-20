package loppolygon;

public class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point o) {
        return Math.sqrt(Math.pow(this.x -o.x, 2) + Math.pow(this.y - o.y, 2));
    }
}
