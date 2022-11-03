package QuanHeGiuaCacLop.quanlybanhang1;

import java.util.ArrayList;

public class Receipt {
    private Merchandise merchandise;
    private Client client;
    private String codeClient, codeMerchandise, code;
    private int amount;
    private long pay;
    public Receipt(int n, String s, ArrayList<Client> a, ArrayList<Merchandise> b) {
        this.code = "HD" + String.format("%03d", n);
        String[] tmp = s.split("\\s+");
        this.codeClient = tmp[0];
        this.codeMerchandise = tmp[1];
        this.amount = Integer.parseInt(tmp[2]);
        this.client = solveClient(a);
        this.merchandise = solveMerchandise(b);
        this.pay = this.merchandise.getPrice()*this.amount;
    }
    private Client solveClient(ArrayList<Client> a) {
        int x = 0;
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i).getCode().equals(codeClient)) {
                x = i;
            }
        } 
        return a.get(x);
    }
    private Merchandise solveMerchandise(ArrayList<Merchandise> a) {
        int x = 0;
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i).getCode().equals(codeMerchandise)) {
                x = i;
            }
        } 
        return a.get(x);
    }
    @Override
    public String toString() {
        return code + " " + client.getName() + " " + client.getAddress() + 
        " " + merchandise.getName() + " " + merchandise.getUnit() + " " 
        + merchandise.getPurchasePrice() + " " + merchandise.getPrice() + " " + amount + " " + pay;
    }
}
