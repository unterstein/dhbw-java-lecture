package ba.java.weiteres.strings;

public class StringBufferBeispiel {

  public StringBufferBeispiel() {
    String string1 = "Hallo!";
    StringBuffer buffer = new StringBuffer(string1);
    // Konkatenierung in Schleife
    for (int i = 0; i < 20; i++) {
      buffer.append(i);         // string1 += "" + i;
    }
    // Wandlung
    String bufferString = new String(buffer);

    // Übung:
    System.out.println(bufferString);
    System.out.println(buffer);
  }

  public static void main(String[] args) {
    new StringBufferBeispiel();
  }
}
