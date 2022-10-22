package hoadon1;

import java.util.ArrayList;

public class Receipt {
    private Product product;
    private String code, cmp, type;
    private int amount, unitPrice;
    private long intoMoney, discount, pay;
    public Receipt(int n, String code, int amount, ArrayList<Product> list) {
        this.code = code + "-" + String.format("%03d", n);
        this.amount = amount;
        this.cmp = code.substring(0, 2);
        this.type = code.substring(2);
        this.product = solveProduct(list);
        this.unitPrice = solveUnitPrice();
        this.intoMoney = (long)amount*(long)unitPrice;
        this.discount = solevDiscount();
        this.pay = intoMoney - discount;
    }
    private long solevDiscount() {
        long tmp;
        if(amount >= 150) tmp = intoMoney/2;
        else if(amount >= 100) tmp = intoMoney*3/10;
        else if(amount >= 50) tmp = intoMoney*15/100;
        else tmp = 0;
        return tmp;
    }
    private int solveUnitPrice() {
        int tmp;
        if(type.equals("1")) {
            tmp = product.getUnitPrice1();
        }
        else tmp = product.getUnitPrice2();
        return tmp;
    }
    private Product solveProduct(ArrayList<Product> list) {
        int x = 0;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getCode().equals(cmp)) {
                x = i;
                break;
            }
        }
        return list.get(x);
    }
    @Override
    public String toString() {
        return code + " " + product.getName() + " " + discount + " " + pay;
    }
}