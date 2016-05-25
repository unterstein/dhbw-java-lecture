package ba.java.gehaltsberechnung;

public class Manager extends Mitarbeiter {

  private final double grundGehalt;
  private final double provision;
  private final double unternehmsUmsatz;

  public Manager(double grundGehalt, double provision, double unternehmsUmsatz) {
    this.grundGehalt = grundGehalt;
    this.provision = provision;
    this.unternehmsUmsatz = unternehmsUmsatz;
  }

  @Override
  public double berechneGehalt() {
    return grundGehalt + provision * unternehmsUmsatz;
  }
}
