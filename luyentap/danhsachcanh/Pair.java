package luyentap.danhsachcanh;

public class Pair<T, S> {
    private T first;
    private S second;
    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }
    @Override
    public String toString() {
        return "(" + first + "," + second + ")";
    }
}
