package ba.java.uebungen;

import java.time.*;

public class Java8DateUebung {

  public static void main(String[] args) throws InterruptedException {

    // Clock ist für Timestamps! Milliseconds seit 01.01.1970
    Clock clock = Clock.systemUTC();
    System.out.println(clock.millis());

    Thread.sleep(1000);

    System.out.println(clock.millis());

    // Clock ist mit einer Zeitzone behafter
    Clock clockWithTimezone = Clock.system(ZoneId.of("Europe/Berlin"));

    System.out.println(clockWithTimezone.millis());


    // LocalDate ist für ausschliesslich für Tag, Monat, Jahr = Datum
    LocalDate date = LocalDate.now();
    LocalDate now2 = LocalDate.of(2017, 6, 16);
    System.out.println(date.equals(now2));
    // LocalDate bietet Arithmetik!
    LocalDate todayPlusTwelve = date.plusDays(30); // LocalDate ist immutable!
    System.out.println(date);
    System.out.println(todayPlusTwelve);


    // LocalTime ist ausschliesslich für Stunde, Minute, Sekunde, Milli = Zeit
    LocalTime time = LocalTime.now();
    // LocalTime bietet Arithmetik!
    LocalTime timeInTwelveMinuts = time.plusMinutes(12).plusHours(23);
    System.out.println(time);
    System.out.println(timeInTwelveMinuts);

    // LocalDate und LocalTime sind kombinierbar. Es kommt ein LocalDateTime heraus!
    LocalDateTime localDateTime = todayPlusTwelve.atTime(timeInTwelveMinuts);
    System.out.println(localDateTime);
    LocalDateTime localDateTimePlus15Minutes = localDateTime.plusMinutes(15);
    LocalDateTime localDateTimePlus1Week = localDateTime.plusWeeks(1);

    // Es gibt auch Dauern
    Duration twelveDayDuration = Duration.ofDays(12);
    Duration twelveSecondDuration = Duration.ofSeconds(12);
    Duration longerDuration = twelveDayDuration.plus(twelveDayDuration);

    LocalDateTime whenAmI = localDateTime.minus(twelveDayDuration).plus(twelveSecondDuration).minus(longerDuration);
    System.out.println(whenAmI);

    System.out.println(LocalDateTime.now().plusDays(4 * 365));
  }
}
