package Collection.hinhsao;

import java.util.ArrayList;

public class DoThi {
    private ArrayList<Canh> a;
    public DoThi(ArrayList<Canh> x) {
       this.a = x;
    }
    public boolean isHinhSao() {
        int canhChung = a.get(0).getCanh1();
        if(canhChung != a.get(1).getCanh1() && canhChung != a.get(1).getCanh2()) {
            canhChung = a.get(0).getCanh2();
        }
        for(Canh i : a) {
            if(canhChung != i.getCanh1() && canhChung != i.getCanh2()) return false;
        }
        return true;
    }
}
