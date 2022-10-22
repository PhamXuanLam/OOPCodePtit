package hoadon2;

import java.util.ArrayList;

public class Receipt {
    private Client client;
    private Product product;
    private String code, codeClient, codeProduct;
    private int amount;
    private long pay;
    public Receipt(int n, String s, ArrayList<Client> clients, ArrayList<Product> products) {
        String[] tmp = s.split("\\s+");
        this.code = "HD" + String.format("%03d", n);
        this.codeClient = tmp[0];
        this.codeProduct = tmp[1];
        this.amount = Integer.parseInt(tmp[2]);
        this.client = solveClient(clients);
        this.product = solveProduct(products);
        this.pay = amount*product.getPrice();
    }
    public Client solveClient(ArrayList<Client> clients) {
        int x = 0;
        for(int i = 0; i < clients.size(); i++) {
            if(clients.get(i).getCode().equals(codeClient)) {
                x = i;
                break;
            }
        }
        return clients.get(x);
    }
    public Product solveProduct(ArrayList<Product> Products) {
        int x = 0;
        for(int i = 0; i < Products.size(); i++) {
            if(Products.get(i).getCode().equals(codeProduct)) {
                x = i;
                break;
            }
        }
        return Products.get(x);
    }
    @Override
    public String toString() {
        return code + " " + client.getName() + " " + client.getAddress() + " " + product.getName() + " " + product.getUnit() + " " + product.getPurchasePrice() + " " + product.getPrice() + " " + amount + " " + pay;
    }
}
