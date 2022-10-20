package test;
import java.util.*;
import java.io.*;
public class Main {
    private static int gcd(int a, int b) {
        int tmp = a % b;
        while(tmp != 0) {
            a = b;
            b = tmp;
            tmp = a % b;
        }
        return b;
    }
    public static void main(String[] args) throws Exception{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> ds = (ArrayList<Pair>) in.readObject();
        in.close();
        ArrayList<Pair> res = new ArrayList<>();
        Map < String,Integer> mp = new TreeMap<>();
        for (Pair x : ds ) {
            String s = x.getFirst()+" "+x.getSecond();
            if (mp.containsKey(s)== false) {
                mp.put(s, 1);
                if (x.getFirst()<x.getSecond() && gcd(x.getFirst(), x.getSecond()) == 1) res.add(x);
            }
        }
        Collections.sort(res);
        for (Pair x : res ) System.out.println(x);
    }
}
