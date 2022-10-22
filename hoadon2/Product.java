package hoadon2;

public class Product {
    private String code, name, unit;
    private int purchasePrice, price;
    public Product(int n, String name, String unit, int purchasePrice, int price) {
        this.code = "MH" + String.format("%03d", n);
        this.name = name;
        this.unit = unit;
        this.purchasePrice = purchasePrice;
        this.price = price;
    }
    public String getCode() {
        return code;
    }
    public int getPurchasePrice() {
        return purchasePrice;
    }
    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public String getUnit() {
        return unit;
    }
}
