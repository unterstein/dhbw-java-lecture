package ba.java.weiteres;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.List;

public class Java8Features {

  // Siehe Java 8 Uebungen!
  public static void main(String[] args) {
    List<String> stringList = new ArrayList<>();
    stringList.add("asd");
    stringList.add("asdads");
    stringList.add("asd123");
    stringList.add("asdasd");
    stringList.add("assgsdfd");
    stringList.add("i231iup");

    for (String s : stringList) {
      if (s.length() > 4) {
        System.out.println(s);
      }
    }

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
