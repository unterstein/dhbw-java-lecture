package ba.java.uebungen;

public class StringUebung {

  public static void main(String[] args) {
    String string1 = "Hallo ";
    System.out.println(string1);
    string1.concat("Welt!");
    System.out.println(string1);
    string1 = string1.concat("Welt!");
    System.out.println(string1);
  }
}
