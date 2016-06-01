package ba.java.weiteres.strings;

public class StringBuilderBeispiel {

  public StringBuilderBeispiel() {
    String string1 = "Hallo!";
    StringBuilder builder = new StringBuilder(string1);
    // Konkatenierung in Schleife
    for (int i = 0; i < 20; i++) {
      builder.append(i);         // string1 += "" + i;
    }
    // Wandlung
    String builderString = new String(builder);

    // Übung:
    System.out.println(builderString);
    System.out.println(builder);
  }

  public static void main(String[] args) {
    new StringBuilderBeispiel();
  }
}
