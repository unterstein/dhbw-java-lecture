package test.test2;

import ba.java.auto.Pkw;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class RuntimeCode {

  public static void main(String[] args) throws Exception {
//    Date date = new Date(1815, 1, 1);
//    System.out.println(date);
//
//    LocalDate today = LocalDate.of(2018, 6, 18);
//    LocalDate somewhen = today.plusYears(1).plusDays(12).plusWeeks(2);
//
//    LocalTime now = LocalTime.of(11, 32);
//    LocalTime localTime = now.plusMinutes(60).plusHours(12);
//    LocalTime now1 = LocalTime.now();
//
//    LocalDateTime wirklichJetzt = LocalDateTime.now();
//
//    LocalDateTime localDateTime = today.atTime(localTime);
//
//    Period zeitspanne = Period.ofDays(2);
//    localDateTime.plus(zeitspanne);

    Pkw pkw = new Pkw();
    pkw.anzahlBlinker = 4;


    for (Method field : pkw.getClass().getDeclaredMethods()) {
      System.out.println(field.getName());
    }

    Field anzahlBlinker = pkw.getClass().getDeclaredField("anzahlBlinker");

    System.out.println(anzahlBlinker.get(pkw));
    anzahlBlinker.set(pkw, 8);
    System.out.println(anzahlBlinker.get(pkw));

    Field meinPrivateInt = pkw.getClass().getDeclaredField("meinPrivateInt");
    meinPrivateInt.setAccessible(true);
    System.out.println(meinPrivateInt.get(pkw));
    meinPrivateInt.set(pkw, 9);
    System.out.println(meinPrivateInt.get(pkw));

    Method blinke = pkw.getClass().getDeclaredMethod("blinkeRechts");
    blinke.invoke(pkw);

    pkw.blinkeRechts();
  }
}
