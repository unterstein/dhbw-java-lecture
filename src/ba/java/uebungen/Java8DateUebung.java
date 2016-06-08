package ba.java.uebungen;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;

public class Java8DateUebung {

  public static void main(String[] args) {

    // Clock ist für Timestamps! Milliseconds seit 01.01.1970
    Clock clock = Clock.systemUTC();

    // Clock ist mit einer Zeitzone behafter
    Clock clockWithTimezone = Clock.system(ZoneId.of("Europe/Berlin"));


    // LocalDate ist für ausschliesslich für Tag, Monat, Jahr = Datum
    LocalDate date = LocalDate.now();
    // LocalDate bietet Arithmetik!
    LocalDate todayPlusTwelve = date.plusDays(12); // LocalDate ist immutable!

    // LocalTime ist ausschliesslich für Stunde, Minute, Sekunde, Milli = Zeit
    LocalTime time = LocalTime.now();
    // LocalTime bietet Arithmetik!
    LocalTime timeInTwelveMinuts = time.plusMinutes(12);

    // LocalDate und LocalTime sind kombinierbar. Es kommt ein LocalDateTime heraus!
    LocalDateTime localDateTime = todayPlusTwelve.atTime(timeInTwelveMinuts);
    LocalDateTime localDateTimePlus15Minutes = localDateTime.plusMinutes(15);
    LocalDateTime localDateTimePlus1Week = localDateTime.plusWeeks(1);

    // Es gibt auch Dauern
    Duration twelveDayDuration = Duration.ofDays(12);
    Duration twelveSecondDuration = Duration.ofSeconds(12);

    LocalDateTime localDateTimePlusDuration = localDateTime.plus(twelveDayDuration);
  }
}
