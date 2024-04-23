package day11.api.lang;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class DateTime {
    public static void main(String[] args) {

        // 자바8 이전
//        Date date = new Date();
//        System.out.println("date = " + date.getYear());
//
//        Calendar calendar = Calendar.getInstance();


        // 자바 8 이후
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);
        System.out.println("now = " + now.getYear());
        System.out.println("now = " + now.getMonthValue());

        LocalTime nowTIme = LocalTime.now();
        System.out.println("nowTIme = " + nowTIme);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        // 특정 날짜 정보 생성하기
        LocalDate localDate = LocalDate.of(2022, 4, 22);
        System.out.println("localDate = " + localDate);

        // 날짜 연산
        // 도서 대여시스템에서 빌린 날짜로부터 3일 뒤가 반납일
        LocalDate rentalDate = LocalDate.now();
        LocalDate returnDate = rentalDate.plusDays(3);
        System.out.println("returnDate = " + returnDate);

        returnDate.plusYears(3).plusWeeks(3).plusDays(5);

        // 사이 날짜 구하기
        LocalDate hireDate = LocalDate.of(2018, 3, 2);
        LocalDate retireDate = LocalDate.of(2022, 8, 3);

        long between = ChronoUnit.DAYS.between(hireDate, retireDate);
        System.out.println("between = " + between);

        // 날짜 포맷 바꾸기
        System.out.println("localDateTime = " + localDateTime);
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분 ss초");
        DateTimeFormatter pattern2 = DateTimeFormatter.ofPattern("yy년 M월 d일 a h시 mm분 ss초");

        String dateString = LocalDateTime.now().format(pattern);
        String dateString2 = LocalDateTime.now().format(pattern2);
        System.out.println("dateString = " + dateString);
        System.out.println("dateString2 = " + dateString2);
    }
}
