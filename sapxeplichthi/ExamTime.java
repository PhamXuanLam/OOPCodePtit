package sapxeplichthi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExamTime {
    private String code, room , testTime;
    private Date testDay;
    public ExamTime(int n, String testDay, String testTime, String room) throws ParseException{
        this.code = "C" + String.format("%03d", n);
        this.testDay = new SimpleDateFormat("dd/MM/yyyy").parse(testDay);
        this.testTime = testTime;
        this.room = room;
    }
    public String getCode() {
        return code;
    }
    public String getRoom() {
        return room;
    }
    public Date getTestDay() {
        return testDay;
    }
    public String getTestTime() {
        return testTime;
    }
}
