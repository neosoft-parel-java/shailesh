package java8Features;

import java.time.*;

public class JavaDateTime {
    public static void main(String[] args) {
        System.out.println("=============LocalDate===================");
        LocalDate localDate = LocalDate.now();
        System.out.println("getDayOfMonth=> " + localDate.getDayOfMonth());
        System.out.println("getDayOfWeek=>"+ localDate.getDayOfWeek().toString());
        System.out.println("getDayOfYear => "+ localDate.getDayOfYear());
        System.out.println("isLeapYear =>"+ localDate.isLeapYear());
        System.out.println("plusDays=> "+ localDate.plusDays(10).toString());

        System.out.println("=============LocalTime===================");
        LocalTime localTime = LocalTime.now();
        System.out.println("getHour=> "+ localTime.getHour());
        System.out.println("getMinute=> "+ localTime.getMinute());
        System.out.println("NOON=> "+ LocalTime.NOON);
        System.out.println("MIDNIGHT=> "+LocalTime.MIDNIGHT);

        System.out.println("============LocalDateTime================");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime=> "+ localDateTime.toString());      //2013-05-15T10:01:14.911
        System.out.println("getDayOfMonth> "+localDateTime.getDayOfMonth()); //15
        System.out.println("getHour> "+localDateTime.getHour());       //10
        System.out.println("getNano> "+localDateTime.getNano());

        System.out.println("================Instant=================");
        Instant instant = Instant.now();
        System.out.println(instant.toString());                                 //2013-05-15T05:20:08.145Z
        System.out.println(instant.plus(Duration.ofMillis(5000)).toString());   //2013-05-15T05:20:13.145Z
        System.out.println(instant.minus(Duration.ofMillis(5000)).toString());  //2013-05-15T05:20:03.145Z
        System.out.println(instant.minusSeconds(10).toString());

        System.out.println("================Duration=================");
        Duration duration = Duration.ofMinutes(10);
        System.out.println(duration.toString());
        duration = Duration.between(Instant.now(), Instant.now().plus(Duration.ofMinutes(10)));
        System.out.println(duration.toString());

        System.out.println("================Period=================");
        Period period = Period.ofDays(6);
        System.out.println(period.toString());
        period = Period.between(LocalDate.now(),
                LocalDate.now().plusDays(60));
        System.out.println(period.toString());
    }
}
