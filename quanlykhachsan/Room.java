package quanlykhachsan;

public class Room {
    private String sign, name;
    private double unitPrice, serviceCharge;
    public Room(String s) {
        String[] tmp = s.split("\\s+");
        this.sign = tmp[0];
        this.name = tmp[1];
        this.unitPrice = Double.parseDouble(tmp[2]);
        this.serviceCharge = Double.parseDouble(tmp[3]);
    }
    public String getSign() {
        return sign;
    }
    public String getName() {
        return name;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public double getServiceCharge() {
        return serviceCharge;
    }
}
