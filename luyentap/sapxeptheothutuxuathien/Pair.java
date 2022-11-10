package luyentap.sapxeptheothutuxuathien;

public class Pair<T, S> implements Comparable<Pair<T, S>> {
    private T first;
    private S second;
    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }
    public Integer getFirst() {
        return (Integer)first;
    }
    public Integer getSecond() {
        return (Integer)second;
    }
    @Override
    public int compareTo(Pair<T,S> o) {
        if((Integer)o.second > (Integer)this.second) return 1;
        else if((Integer)o.second < (Integer)this.second) return -1;
        else return 0;
    } 
}
