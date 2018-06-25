package test.test2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DateBeispiele {
  public static void main(String[] args) {
    LocalDate localDate = LocalDate.of(2018, 06, 25);
    LocalDate localDate1 = localDate.plusDays(50).plusWeeks(2);
    System.out.println(localDate1);

    LocalTime time = LocalTime.of(14, 15);
    LocalTime localTime = time.plusHours(12);

    LocalDateTime with = localDate.atTime(time);
    System.out.println(with);

    Period period = Period.ofDays(2);
    System.out.println(with.plus(period));

    LocalDate parsed = LocalDate.parse("2018-08-28");
    System.out.println(parsed);

    LocalDate.now();
    LocalTime.now();
  }
}
