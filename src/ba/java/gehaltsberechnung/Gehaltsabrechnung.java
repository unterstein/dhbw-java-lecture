package ba.java.gehaltsberechnung;

import java.util.ArrayList;
import java.util.List;

public class Gehaltsabrechnung {

  private List<Mitarbeiter> alleMitarbeiter;

  public Gehaltsabrechnung(List<Mitarbeiter> alleMitarbeiter) {
    this.alleMitarbeiter = alleMitarbeiter;
  }

  public double berechneAlleGehaelter() {
    double result = 0.0;
    for (Mitarbeiter mitarbeiter : alleMitarbeiter) {
      result += mitarbeiter.berechneGehalt();
    }
    return result;
  }


  public static void main(String[] args) {
    List<Mitarbeiter> unsereMitarbeiter = new ArrayList<>();
    unsereMitarbeiter.add(new Arbeiter(10, 150));
    unsereMitarbeiter.add(new Angestellter(3000, 1000));

    Gehaltsabrechnung gehaltsabrechnung = new Gehaltsabrechnung(unsereMitarbeiter);
    System.out.println(gehaltsabrechnung.berechneAlleGehaelter());
  }
}
