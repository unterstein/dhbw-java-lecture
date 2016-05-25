package ba.java.gehaltsberechnung;

public class Geschaeftsfuehrer extends Manager {

  private final double zulage;

  public Geschaeftsfuehrer(double grundGehalt, double provision, double unternehmsUmsatz, double zulage) {
    super(grundGehalt, provision, unternehmsUmsatz);
    this.zulage = zulage;
  }

  @Override
  public double berechneGehalt() {
    return super.berechneGehalt() + zulage;
  }
}
