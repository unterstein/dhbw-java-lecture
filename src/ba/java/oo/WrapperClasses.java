package ba.java.oo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;

public class WrapperClasses {
  public WrapperClasses() throws IOException {
    // Instanziierung

    // Übergabe des zu kapselnden primitiven Typs
    Integer integer1 = new Integer(Short.MAX_VALUE);
    // Meist können auch Strings übergeben werden
    // Vorsicht bei diesem Aufruf.
    // Es kann eine Ausnahme auftreten!
    Integer integer2 = new Integer("1");

    // Rückgabe, auch schon gecastet möglich
    int i = integer1.intValue();
    short short1 = integer1.shortValue();
    System.out.println(i);
    System.out.println(short1);
    String string1 = integer1.toString();
    System.out.println(string1);

    // Auch das parsen von Strings ist meistens möglich
    // Auch hier kann eine Ausnahme auftreten!
    Integer integer3 = Integer.parseInt("42");

    // Kann natürlich auch in die Hose gehen!
//    Integer intereger4 = Integer.parseInt("Müll");

    Integer i12 = 12;
    i12.intValue();
    spassMitBoxing(i12);

    Process exec = Runtime.getRuntime().exec("say hello");
    BigDecimal dec1 = new BigDecimal("123231321123123123123.1213132123213213312");
    BigDecimal dec2 = new BigDecimal("123231321123123123123.1213132123213213312");
    System.out.println(dec1.add(dec2));
//    Runtime.getRuntime().exec("say " + dec1.add(dec2));
    String hello = String.format("say %s - %d", "lalala", 123123);
    System.out.println(hello);
  }

  private void spassMitBoxing(int i) {
    System.out.println(i);
  }

  public static void main(String[] args) throws IOException {
    new WrapperClasses();
  }
}
