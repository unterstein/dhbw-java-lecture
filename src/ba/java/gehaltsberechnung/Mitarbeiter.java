package ba.java.gehaltsberechnung;

public abstract class Mitarbeiter {

  public abstract double berechneGehalt();

  private int id;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void gehaltsErhoehung() {
    // hier gibt es mehr Gehalt!
  }

}
