package ba.java.oo.innerclasses;

import ba.java.auto.Pkw;

public class PkwInnerClasses {

  class $asddsasad1 {
    private String lala;
  }
  void lala() {
    new $asddsasad1();
  }

  public static void main(String[] args) {
    class SpecialPkw extends Pkw {
      @Override
      public void blinkeRechts() {
        System.out.println("blink blink blink");
      }
    }

    Pkw pkw3 = new SpecialPkw();
    pkw3.blinkeRechts();

    Pkw pkw = new Pkw() {
      @Override
      public void blinkeRechts() {
        System.out.println("blink blink blink");
      }
    };
    pkw.blinkeRechts();

    Pkw pkw2 = new Pkw();
    pkw2.blinkeRechts();

  }
}
