package ba.java.gehaltsberechnung;

public class Arbeiter extends Mitarbeiter {
  private final double stundenLohn;
  private final double stunden;

  public Arbeiter(double stundenLohn, double stunden) {
    this.stundenLohn = stundenLohn;
    this.stunden = stunden;
  }

  @Override
  public double berechneGehalt() {
    return stunden * stundenLohn;
  }
}
