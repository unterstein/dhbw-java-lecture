package ba.java.uebungen;

import ba.java.gehaltsberechnung.Gehaltsabrechnung;
import ba.java.gehaltsberechnung.Manager;
import ba.java.gehaltsberechnung.Mitarbeiter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8Uebung {

  public static String methodRef(String s) {
    return s + "2";
  }

  public static void main(String[] args) {
    List<String> liste = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      liste.add("" + i);
    }
    liste.stream() // Keyword für Java8 Collections
        .map(Java8Uebung::methodRef) // .map erwartet Rückgabewert -> return String
        .distinct() // alle Werte kommen nur noch ein mal vor
        .forEach(string -> {
          System.out.print(string);
          System.out.println(string); // Code-Blöcke gehen auch
        }); // .forEach ist das gleiche wie .map, allerdings ohne Rückgabewert -> return void

    Optional<Integer> result = liste.stream() // .reduce liefert ein Optional zurück! "Kann was drin sein, muss aber nicht"
        .map(string -> string.length()) // .map funktioniert auch mit Lambdas
        .reduce((eins, zwei) -> eins + zwei);// .reduce reduziert alle Werte (paarweise) aus der Liste zu einem, basierend auf Lambda
    System.out.println("result:" + result);

    boolean anyMatch = liste.stream()
        .anyMatch(s -> Integer.valueOf(s) % 2 == 0); // checks mit .anyMatch

    System.out.println(anyMatch);

    boolean allMatch = liste.stream()
        .allMatch(s -> Integer.valueOf(s) % 2 == 0); // checks mit .allMatch

    System.out.println(allMatch);

    Optional<String> reduce = liste.stream()
        .filter(s -> Integer.valueOf(s) % 2 == 0) // Mit .filter auch filtern auch möglich
        .reduce((a, b) -> a + ", " + b); // .reduce kann auch auf Strings angewendet werden
    System.out.println(reduce.get()); // optional.get() liefert eigentlichen Wert zurück

    // Optionals
    Optional<String> optional = Optional.empty();
    System.out.println(optional);
    System.out.println(optional.isPresent());
    // System.out.println(optional.get()); // .get auf empty Optionals geht nicht...

    // Beispiel: Mitarbeiter!
    // Alle Manager erhalten eine Gehaltserhöhung
    Gehaltsabrechnung.alleMitarbeiter().stream() //
        .filter(mitarbeiter -> mitarbeiter instanceof Manager) //
        .forEach(Mitarbeiter::gehaltsErhoehung);

    // Alle Mitarbeiter filtern ab bestimmtem Gehalt und zählen
    long mitarbeiterAnzahl = Gehaltsabrechnung.alleMitarbeiter().stream()
        .filter(mitarbeiter -> mitarbeiter.berechneGehalt() > 1000)
        .count();

    // Alle Mitarbeiter filtern ab bestimmtem Gehalt und wieder in Liste zusammen führen
    List<Mitarbeiter> mitarbeiterMitBestimmtenGehalt = Gehaltsabrechnung.alleMitarbeiter().stream()
        .filter(mitarbeiter -> mitarbeiter.berechneGehalt() > 1000)
        .collect(Collectors.toList());

    // Und jetzt mal alle Gehälter berechnen!
    Double alleGehaelter = Gehaltsabrechnung.alleMitarbeiter()
        .stream()
        .map(Mitarbeiter::berechneGehalt)
        .reduce((m1, m2) -> m1 + m2).orElseGet(() -> 0.0);
    System.out.println(alleGehaelter);
  }
}
