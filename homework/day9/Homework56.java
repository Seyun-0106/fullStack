package homework.day9;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
/*
5. 출발지와 도착지를 멤버변수로 만들고, 추상메소드로 국내선인지 국외선인지를 입력받는 메소드를 만드시오
출발 날짜, 도착날짜를 getter로 만들고 02-01-2021형식으로 출력하는 메소드를 만드시오
국내선 : 1.김포, 2.인천, 3.김해, 4.제주, 5.울산
국제선 : 1.도쿄, 2.상하이, 3.홍콩, 4.싱가폴, 5.쿠알라룸푸르

6. Airplane 추상 클래스에 String flight() 추상메소드를 구현하시오
자식 클래스에서 도착지가 국내선 또는 국제선에 따라 Airplane 멤버변수
isDomestic의 값을 변경하도록 구현하시오

*/
public class Homework56 {
    public static void main(String[] args) {
        Info info = new Info();
        info.flight();
        System.out.println("도착지 : " + info.destination);
        info.getDate();
    }
}

abstract class AirPlane2 {
    String departurePoint;
    String destination;

    public abstract String flight();
}

class Info extends AirPlane2 {
    boolean isDomestic;

    @Override
    public String flight() {
        System.out.println("항공편을 입력하세요.(국내선/ 국제선)");
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        if (str.equals("국내선")) {
            isDomestic = true;
            System.out.print("국내선 : 1.김포, 2.인천, 3.김해, 4.제주, 5.울산\n");
        
            System.out.println("도착지를 선택하세요(숫자)");
            int num = scn.nextInt();

            switch (num) {
                case 1:
                destination = "김포";
                break;
                case 2:
                destination = "인천";
                break;
                case 3:
                destination = "김해";
                break;
                case 4:
                destination = "제주";
                break;
                case 5:
                destination = "울산";
                break;                    
            }
        } else if (str.equals("국제선")) {
            isDomestic = false;
            System.out.print("국제선 : 1.도쿄, 2.상하이, 3.홍콩, 4.싱가폴, 5.쿠알라룸푸르");

            System.out.println("도착지를 선택하세요(숫자)");
            int num = scn.nextInt();

            switch (num) {
                case 1:
                    destination = "됴쿄";
                    break;
                case 2:
                    destination = "상하이";
                    break;
                case 3:
                    destination = "홍콩";
                    break;
                case 4:
                    destination = "싱가폴";
                    break;
                case 5:
                    destination = "쿠알라룸푸르";
                    break;
            }
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
        
        return str;
    }

    public void getDate() {
        Calendar c = Calendar.getInstance();
        DecimalFormat df = new DecimalFormat("00");
        int dYear = c.get(Calendar.YEAR);
        int dMonth = c.get(Calendar.MONTH) + 1;
        int dDay = c.get(Calendar.DAY_OF_MONTH);

        String fYear = df.format(dYear);
        String fMonth = df.format(dMonth);
        String fDay = df.format(dDay);
        System.out.printf("출발 날짜 : %s-%s-%s", fMonth, fDay, fYear);
    }

}