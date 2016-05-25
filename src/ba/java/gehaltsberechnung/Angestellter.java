package ba.java.gehaltsberechnung;

public class Angestellter extends Mitarbeiter {
  private final double grundGehalt;
  private final double zulage;

  public Angestellter(double grundGehalt, double zulage) {
    this.grundGehalt = grundGehalt;
    this.zulage = zulage;
  }

  @Override
  public double berechneGehalt() {
    return grundGehalt + zulage;
  }
}
