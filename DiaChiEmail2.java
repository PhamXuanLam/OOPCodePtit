import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DiaChiEmail2 {
    private static String chuanHoa(String s) {
        String[] x = s.trim().toLowerCase().split("\\s+");
        String tmp = "";
        tmp += x[x.length - 1];
        for(int i = 0; i < x.length - 1; i++) {
            tmp += x[i].substring(0, 1);
        }
        return tmp;
    }
    private static String solveEmail(String x, int i) {
        String tmp = "";
        if(i == 1) {
            tmp += x + "@ptit.edu.vn";
        }
        else {
            tmp += x + Integer.toString(i) + "@ptit.edu.vn";
        }
        return tmp;
    }
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> check = new ArrayList<>();
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            String x = chuanHoa(s);
            if(!check.contains(x)) {
                if(map.containsKey(x)) {
                    map.compute(x, (key, val) -> val += 1);
                }
                else {
                    map.put(x, 1);
                }
                String email = solveEmail(x, map.get(x));
                System.out.println(email);
                check.add(x);
            }
        }
    }
}