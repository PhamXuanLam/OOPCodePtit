package quanlykhachsan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Client implements Comparable<Client> {
    private Room room;
    private String code, name, codeRoom;
    private Date arrivalDate, leaveDate;
    private double dateOfStay, intoMoney, serviceCharge, discount, pay;
    public Client(int n, String name, String codeRoom, String arrivalDate, String leaveDate, ArrayList<Room> a) throws ParseException {
        this.code = "KH" + String.format("%02d", n);
        this.name = name;
        this.codeRoom = codeRoom;
        this.arrivalDate = new SimpleDateFormat("dd/MM/yyyy").parse(arrivalDate);
        this.leaveDate = new SimpleDateFormat("dd/MM/yyyy").parse(leaveDate);
        this.dateOfStay = solveDateOfStay();
        this.room = solveRoom(a);
        this.intoMoney = solveIntoMoney();
        this.serviceCharge = solveServiceCharge();
        this.discount = solveDiscount();
        this.pay = (intoMoney + serviceCharge)*(1 - discount); 
    }
    private double solveDiscount() {
        double tmp;
        if(dateOfStay < 10 ) tmp = 0.0;
        else if(dateOfStay < 20) tmp = 0.02;
        else if(dateOfStay < 30) tmp = 0.04;
        else tmp = 0.06;
        return tmp;
    }
    private double solveServiceCharge() {
        return room.getServiceCharge()*intoMoney;
    }
    private Room solveRoom(ArrayList<Room> a) {
        int x = 0;
        String tmp = codeRoom.substring(2, 3);
        for(int i = 0; i < a.size(); i++) {
            if(tmp.equals(a.get(i).getSign())) {
                x = i;
                break;
            }
        }
        return a.get(x);
    }
    private double solveDateOfStay(){
        return (leaveDate.getTime() - arrivalDate.getTime()) /(24 * 60 * 60 * 1000);
    }
    private double solveIntoMoney() {
        double tmp = dateOfStay;
        if(tmp == 0) return room.getUnitPrice();
        else return room.getUnitPrice()*tmp;
    }
    @Override
    public String toString() {
        return code + " " + name + " " + codeRoom + " " + String.format("%.0f %.2f", dateOfStay, pay);
    }
    @Override
    public int compareTo(Client o) {
        return (int)o.dateOfStay - (int)this.dateOfStay;
    }
}