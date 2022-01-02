package homework;

import java.text.SimpleDateFormat;

public class DataDisplay {
    public static void main(String[] args) {
        DataDisplay today = new DataDisplay();
        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");

        System.out.println(date.format(today) + " " + time.format(today));
    }
}
