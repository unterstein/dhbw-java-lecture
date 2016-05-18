package ba.java.grundlagen1;

public class Viereck {
  int breite;
  int laenge;

  public Viereck(int breite) {
    // Konstruktor-Verkettung!
    this(breite, breite);
  }

  public Viereck(int breite, int laenge) {
    this.breite = breite;
    this.laenge = laenge;
  }

  public static void main(String[] args) {
    new Viereck(4);
    new Viereck(4, 6);
  }
}
