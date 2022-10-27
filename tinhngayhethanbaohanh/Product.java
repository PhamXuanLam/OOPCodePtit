package tinhngayhethanbaohanh;

public class Product {
    private String code, name;
    private int price;
    private long warrantyPeriod;
    public Product(String code, String name, int price, long warrantyPeriod) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.warrantyPeriod = warrantyPeriod;
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public long getWarrantyPeriod() {
        return warrantyPeriod;
    }
}
