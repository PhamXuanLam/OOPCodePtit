package QuanHeGiuaCacLop.sapxephoadonbanquanao;

public class Product {
    private String code, name;
    private int unitPrice1, unitPrice2;
    public Product(String code, String name, int unitPrice1, int unitPrice2) {
        this.code = code;
        this.name = name;
        this.unitPrice1 = unitPrice1;
        this.unitPrice2 = unitPrice2;
    }
    public String getCode() {
        return code;
    }
    public int getUnitPrice1() {
        return unitPrice1;
    }
    public int getUnitPrice2() {
        return unitPrice2;
    }
    public String getName() {
        return name;
    }
}

