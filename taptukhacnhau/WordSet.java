package taptukhacnhau;

import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set;
    public WordSet() {
    }
    public WordSet(String S) {
        String[] s = S.toLowerCase().split("\\s+");
        TreeSet<String> a = new TreeSet<>();
        for(String i : s) {
            a.add(i);
        }
        this.set = a;
    }
    public WordSet(TreeSet<String> s) {
        this.set = s;
    }
    public WordSet union(WordSet o) {
        TreeSet<String> tmp = new TreeSet<>();
        for(String i : this.set) {
            tmp.add(i);
        } 
        for(String i : o.set) {
            tmp.add(i);
        }
        WordSet res = new WordSet(tmp);
        return res;
    }
    public WordSet intersection(WordSet o) {
        TreeSet<String> tmp = new TreeSet<>();
        for(String i : this.set) {
            if(o.set.contains(i)) {
                tmp.add(i);
            }
        }
        WordSet res = new WordSet(tmp);
        return res;
    }
    @Override
    public String toString() {
        String tmp = "";
        for(String i : set) {
            tmp += i + " ";
        }
        return tmp.trim();
    }
}
