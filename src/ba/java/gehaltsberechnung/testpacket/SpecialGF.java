package ba.java.gehaltsberechnung.testpacket;

import ba.java.gehaltsberechnung.Geschaeftsfuehrer;

public class SpecialGF extends Geschaeftsfuehrer {
  public SpecialGF(double grundGehalt, double provision, double unternehmsUmsatz, double zulage) {
    super(grundGehalt, provision, unternehmsUmsatz, zulage);
  }
}
