package QuanHeGiuaCacLop.quanlybanhang1;

public class Merchandise {
    private String code, name, unit;
    private long purchasePrice, price;
    public Merchandise(int n, String name, String unit, long purchasePrice, long price) {
        this.code = "MH" + String.format("%03d", n);
        this.name = name;
        this.unit = unit;
        this.purchasePrice = purchasePrice;
        this.price = price;
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public String getUnit() {
        return unit;
    }
    public long getPurchasePrice() {
        return purchasePrice;
    }
    public long getPrice() {
        return price;
    }
}
