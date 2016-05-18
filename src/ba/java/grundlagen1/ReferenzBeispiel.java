package ba.java.grundlagen1;

import ba.java.auto.Pkw;

public class ReferenzBeispiel {

  public static void main(String[] args) {
    Pkw pkw = new Pkw();
    pkw.anzahlBlinker = 12;
    doSomething(pkw);
    System.out.println(pkw.anzahlBlinker);
  }

  public static void doSomething(Pkw pkw) {
    pkw = new Pkw();
    pkw.anzahlBlinker = 1;
    System.out.println(pkw.anzahlBlinker);
  }
}
