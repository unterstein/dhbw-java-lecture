package ba.java.uebungen;

public class StringUebung {

  public static void main(String[] args) {
    String string1 = "Hallo ";
    System.out.println(string1);
    string1.concat("Welt!");
    System.out.println(string1);
    string1 = string1.concat("Welt!");
    System.out.println(string1);

    System.out.println("----");

    String string2 = "Hallo1";
    String string3 = "Hallo".concat("1");
    System.out.println(string2 == string3);

    String string4 = "Hallo1".replace("1", "2");
    String string5 = "Hallo2";
    String string6 = "Hallo2";
    System.out.println(string4 == string5);
    System.out.println(string4 == string6);
    System.out.println(string5 == string6);
  }
}
