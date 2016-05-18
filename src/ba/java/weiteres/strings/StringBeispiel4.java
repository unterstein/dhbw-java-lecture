package ba.java.weiteres.strings;

public class StringBeispiel4 {

  public StringBeispiel4() {
    String string1 = "Hallo!";

    // Suchen in Zeichenketten:

    // int indexOf(String s)
    // Sucht das erste Vorkommen von s innerhalb der Zeichenkette. Wird s gefunden, wird der
    // Index des ersten übereinstimmenden Zeichens zurückgeliefert, ansonsten -1. Eine Variante
    // der Methode akzeptiert einen Parameter vom Typ char.
    int index1 = string1.indexOf("x");
    int index2 = string1.indexOf("l");
    // Fehlercode vs. explizite Ausnahme? Was ist euer Gefühl?

    // int indexOf(String s, int fromIndex)
    // Arbeitet wie die vorige Methode, beginnt allerdings mit der Suche erst bei fromIndex.
    // Auch hier akzeptiert eine Variante der Methode einen Parameter vom Typ char.
    int index3 = string1.indexOf("l", 3);

    // int lastIndexOf(String s)
    // Sucht nach dem letzten Vorkommen von s. Eine Variante der Methode akzeptiert einen
    // Parameter vom Typ char.
    int index4 = string1.lastIndexOf("l");

    // Übung:
    System.out.println(index1);
    System.out.println(index2);
    System.out.println(index3);
    System.out.println(index4);
  }

  public static void main(String[] args) {
    new StringBeispiel4();
  }
}
