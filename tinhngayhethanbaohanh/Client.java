package tinhngayhethanbaohanh;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Client implements Comparable<Client> {
    private Product product;
    private String code, name, address, codeProduct;
    private int amount, pay;
    private LocalDate purchaseDate, warrantyExpirationDate;
    public Client(int n, String name, String address, String codeProduct, int amount, String purchaseDate, ArrayList<Product> a) throws ParseException {
        this.code = "KH" + String.format("%02d", n);
        this.name = name;
        this.address = address;
        this.codeProduct = codeProduct;
        this.amount = amount;
        this.purchaseDate = DateTimeFormatter.ofPattern("dd/MM/yyyy").parse(purchaseDate, LocalDate::from);
        this.product = solveProduct(a);
        this.pay = amount*product.getPrice();
        this.warrantyExpirationDate = this.purchaseDate.plusMonths(product.getWarrantyPeriod());
    }   
    private Product solveProduct(ArrayList<Product> a) {
        int x = 0;
        for(int i = 0; i < a.size(); i++) {
            if(codeProduct.equals(a.get(i).getCode())) {
                x = i;
            }
        }
        return a.get(x);
    } 
    @Override
    public String toString() {
        return code + " " + name + " " + address + " " + product.getCode() + " " + pay + " " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(warrantyExpirationDate);
    }
    @Override
    public int compareTo(Client o) {
        if(this.warrantyExpirationDate.compareTo(o.warrantyExpirationDate)==0)
            return this.code.compareTo(o.code);
        return this.warrantyExpirationDate.compareTo(o.warrantyExpirationDate);
    }
}
