import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ThongKeCacTuKhacNhauTrongFileVanBan {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        int t = Integer.parseInt(sc.nextLine());
        String s = "";
        while(t-- > 0) {
            s += sc.nextLine().toLowerCase() + " ";
        }
        String[] tmp = s.split("\\W\\s*");
        Map<String, Integer> map = new HashMap<>();
        for(String i : tmp) {
            if(!i.equals("")) {
                if(map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                }
                else {
                    map.put(i, 1);
                }
            }
        }
        List<Map.Entry<String, Integer>> res = new ArrayList<>(map.entrySet());
        Collections.sort(res, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        Collections.sort(res, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        res.forEach(i -> System.out.println(i.getKey() + " " + i.getValue()));
    }
}
