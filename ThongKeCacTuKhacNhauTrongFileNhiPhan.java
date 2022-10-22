import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ThongKeCacTuKhacNhauTrongFileNhiPhan {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = new ArrayList<>();
        a = (ArrayList<String>) ois.readObject();
        ois.close();
        String s = "";
        for(String i : a) {
            s += i.toLowerCase() + " ";
        }
        String[] tmp = s.split("\\W\\s*");
        HashMap<String, Integer> map = new HashMap<>();
        for(String i : tmp) {
            if (!i.equals("")) {
                if(map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                }
                else {
                    map.put(i, 1);
                }
            }
        }
        ArrayList<HashMap.Entry<String, Integer>> res = new ArrayList<>(map.entrySet());
        Collections.sort(res, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        Collections.sort(res, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        res.forEach(i -> System.out.println(i.getKey() + " " + i.getValue()));
    }
}
