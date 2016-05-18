package ba.java.grundlagen1;

import ba.java.auto.BodenFahrzeug;
import ba.java.auto.Lkw;
import ba.java.auto.Pkw;

public class ReferenzCopyBeispiel {

  private static void test1() {
    Pkw pkw = new Pkw();
    pkw.anzahlBlinker = 12;
    bar(pkw);
    System.out.println("aussen: " + pkw.anzahlBlinker + ":" + pkw);
    Pkw pkw2 = test(pkw);
    System.out.println(5 == 5);
    System.out.println(new Integer(5) == new Integer(5));
    String s1 = "hallo";
    String s2 = "hallo";
    System.out.println(s1 == s2);
    System.out.println("hallo".equals("hallo"));
  }

  private static void test2() {
    int integer1 = 12;
    long long1 = Long.MAX_VALUE - 100;
    int integer2 = (int) long1;
    System.out.println(integer1);
    System.out.println(long1);
    System.out.println(integer2);

    Pkw pkw = new Pkw();
    BodenFahrzeug boden = new Lkw();
    if (boden instanceof Pkw) {
      Pkw pkw2 = (Pkw) boden;

      System.out.println(pkw2.getHöhe());
    }
    String result = boden instanceof Pkw ? "Pkw" : "Kein Pkw";
  }

  public static Pkw test(Pkw pkw) {
    return pkw;
  }

  public static void bar(Pkw pkw) {
//    pkw = new Pkw();
    pkw.anzahlBlinker = 1;
    System.out.println("innen: " + pkw.anzahlBlinker + ":" + pkw);
  }

  public static void main(String[] args) {
    test1();
    test2();
  }
}
