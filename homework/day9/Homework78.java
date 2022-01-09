package homework.day9;

import java.util.*;

//7. ArrayList에 현재 시간의 Data 객체를 입력하고, ArrayList 값을 차례대로 출력하시오
//8. ArrayList에 내일시간의 Date 객체를 입력하고, ArrayList의 값을 차례대로 출력하시오.(심화)

public class Homework78 {
    public static void main(String[] args) {
        ArrayList <Date>arr = new ArrayList<>();
        Date today = new Date();
        arr.add(today);
        System.out.println(arr);
        
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 1); // 내일
        Date tomorrow = c.getTime();
        arr.add(tomorrow);
        System.out.println(arr);

    }
}
