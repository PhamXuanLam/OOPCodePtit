import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class GiaTriNhiPhan {
    private static String solveFirst(String s) {
        String tmp = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0' || s.charAt(i) == '1') {
                tmp += s.charAt(i);
            }
        }
        return tmp;
    }
    private static long solveSecond(String s) {
        long sum = 0;
        int x = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == 1) {
                sum += Math.pow(2, x);
            }
            x++;
        }
        return sum;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = new ArrayList<>();
        a = (ArrayList<String>) ois.readObject();
        ois.close();
        for(String i : a) {
            String x = solveFirst(i);
            long y = solveSecond(x);
            System.out.println(x + " " + y);
        }
    }
}
