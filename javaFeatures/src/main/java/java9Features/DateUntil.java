package java9Features;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

public class DateUntil {
    public static void main(String[] args) {
        System.out.println( getDaysInJava9(LocalDate.now(), LocalDate.now().plusDays(10)) );
        System.out.println( getDaysInJava9Weeks(LocalDate.now(), LocalDate.now().plusWeeks(10)) );
    }

    //Stream of dates with 1 day difference
    public static List<LocalDate> getDaysInJava9(LocalDate start, LocalDate end) {
        return start.datesUntil(end).collect(Collectors.toList());
    }

    //Stream of dates with 1 week difference
    public static List<LocalDate> getDaysInJava9Weeks(LocalDate start, LocalDate end) {
        return start.datesUntil(end, Period.ofWeeks(1)).collect(Collectors.toList());
    }
}

//output:
/*
* [2019-12-10, 2019-12-11, 2019-12-12, 2019-12-13, 2019-12-14, 2019-12-15, 2019-12-16, 2019-12-17, 2019-12-18, 2019-12-19]
* [2019-12-10, 2019-12-17, 2019-12-24, 2019-12-31, 2020-01-07, 2020-01-14, 2020-01-21, 2020-01-28, 2020-02-04, 2020-02-11]
* */
