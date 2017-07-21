package ba.java.weiteres;

import ba.java.gehaltsberechnung.Gehaltsabrechnung;
import ba.java.gehaltsberechnung.Mitarbeiter;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Java8Features {

  // Siehe Java 8 Uebungen!
  public static void main(String[] args) {

    int gehalt = 0;
    for (Mitarbeiter mitarbeiter : Gehaltsabrechnung.alleMitarbeiter()) {
      gehalt += mitarbeiter.berechneGehalt();
    }
    System.out.println(gehalt);
    Gehaltsabrechnung.alleMitarbeiter().stream()
        .filter(mitarbeiter -> mitarbeiter.berechneGehalt() > 1000)
        .map(mitarbeiter -> mitarbeiter.berechneGehalt())
        .reduce((a, b) -> a + b);

    List<Integer> aListe = new LinkedList<>();
    aListe.add(1);

    Optional<Integer> reduce = aListe.stream().reduce((a, b) -> a + b);
    System.out.println(reduce);

    List<String> stringList = new ArrayList<>();
    stringList.add("asd");
    stringList.add("asd123");
    stringList.add("asd213312");
    stringList.add("asddsfgsd");
    stringList.add("asd3564567");
    stringList.add("a");
    stringList.add("ab");

    for (String s : stringList) {
      if (s.length() > 4) {
        System.out.println(s);
      }
    }
    stringList.stream().filter(a -> a.length() > 4).forEach(System.out::print);


    List<String> meineListe = new ArrayList<>();

    // stream/bulk operations
    stringList.stream() // stream ist Schlüsselmethode für Bulkoperations
        .filter(string -> string.length() > 4) // filtert basierend auf Predicate (Lambda Expression!)
        .forEach(string -> System.out.println(string)); // forEach hat keinen Rückgabewert

    stringList.stream() // stream ist Schlüsselmethode für Bulkoperations
        .filter(string -> string.length() > 4) //
        .map(string -> string.length()) // map muss Rückgabewert haben, damit man weiter machen kann
        .reduce((x, y) -> x + y);


    // Lambda expressions
    Button button = new Button();
    button.setOnMouseClicked(new EventHandler<MouseEvent>() {

      @Override
      public void handle(MouseEvent event) {
        System.out.println(event.getClickCount());
      }
    });

    button.setOnMouseClicked(clickEvent -> System.out.println(clickEvent.getClickCount()));
  }

  public static void printSring(String string) {
    System.out.println(string);
  }
}
