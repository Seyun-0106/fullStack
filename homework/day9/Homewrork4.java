package homework.day9;

import java.util.*;

//4. Airplane 추상 클래스를 만들고 출발 날짜와 도착 날짜를 Calendar 객체로 받는 setter를 만드시오.
//main에서 객체 생성 후 setter을 통해 출발 날짜 2022 년 2 월 1 일,도착날짜 2022 년 2 월 2 일로 지정하시오


public class Homewrork4 {
    public static void main(String[] args) {
        Plan plan = new Plan();
        plan.setDepartureDate(2022, 2, 1);
        plan.setDepartureDate();
        plan.setArrivalDate(2022, 2, 2);
        plan.setArrivalDate();

        System.out.printf("출발 날짜 : %d년 %d월 %d일\n", plan.dYear, plan.dMonth, plan.dDay);
        System.out.printf("도착 날짜 : %d년 %d월 %d일", plan.aYear, plan.aMonth, plan.aDay);
    }
}

abstract class Airplane {
    String departureDate;
    String arrivalDate;


    public abstract void setDepartureDate();

    public abstract void setArrivalDate();
    
    
}

class Plan extends Airplane {
    int dYear, dMonth, dDay, aYear, aMonth, aDay;

    @Override
    public void setDepartureDate() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, dYear);
        c.set(Calendar.MONTH, dMonth);
        c.set(Calendar.DAY_OF_MONTH, dDay);
    }

    @Override
    public void setArrivalDate() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, aYear);
        c.set(Calendar.MONTH, aMonth);
        c.set(Calendar.DAY_OF_MONTH, aDay);
    }

    public void setDepartureDate(int dYear, int dMonth, int dDay) {
        this.dYear = dYear;
        this.dMonth = dMonth;
        this.dDay = dDay;
    }
    
    public void setArrivalDate(int aYear, int aMonth, int aDay) {
        this.aYear = aYear;
        this.aMonth = aMonth;
        this.aDay = aDay;
    }

}
