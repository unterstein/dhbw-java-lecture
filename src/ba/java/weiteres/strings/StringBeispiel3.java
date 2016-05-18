package ba.java.weiteres.strings;

public class StringBeispiel3 {
  public StringBeispiel3() {
    String string1 = "Hallo!";
    String stringA = "a";
    String stringB = "b";

    // Vergleich von Zeichenketten:

    // boolean startsWith(String s)
    // Testet, ob ein String mit der angegebenen Zeichenkette beginnt.
    boolean startsWith = string1.startsWith("Ha");
    // boolean endsWith(String s)
    // Testet, ob ein String mit der angegebenen Zeichenkette endet.
    boolean endsWith = string1.endsWith("o!");
    // int compareTo(String s)
    // Lexikalischer Vergleich beider Strings durch paarweisen Vergleich der einzelnen Zeichen
    // von links nach rechts. Ist der aktuelle String kleiner als s, wird ein negativer Wert
    // zurückgegeben. Ist er größer, wird ein positiver Wert zurückgegeben. Bei Gleichheit ist
    // der Rückgabewert 0. --> Wichtig für Sortierung und Collections!
    int compare1 = stringA.compareTo(stringB);
    int compare2 = stringB.compareTo(stringA);
    int compare3 = stringA.compareTo(stringA);

    // Übung:
    System.out.println(startsWith);
    System.out.println(endsWith);
    System.out.println(compare1);
    System.out.println(compare2);
    System.out.println(compare3);
  }

  public static void main(String[] args) {
    new StringBeispiel3();
  }
}
