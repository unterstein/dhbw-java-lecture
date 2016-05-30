package ba.java.uebungen;

public class ReferenzenUebung {

  private static class TestKlasse {
    private int serienNummer;
  }

  public static void main(String[] args) {

    // Spaß mit der Klasse TestKlasse
    TestKlasse test1 = new TestKlasse();
    test1.serienNummer = 12;
    TestKlasse test2 = test1;
    TestKlasse test3 = new TestKlasse();
    test3.serienNummer = 12;

    System.out.println("TestKlasse:");
    System.out.println(test1 == test2);
    System.out.println(test1 == test3);

    // Spaß mit Strings
    String string1 = "Hallo";
    String string2 = "Hallo";
    String string3 = "Hall".concat("o");
    System.out.println("Strings:");
    System.out.println(string1 == string2);
    System.out.println(string1 == string3);
    System.out.println(string1 == string3);
    System.out.println(string2 == string3);
    System.out.println("Nun mit .equals():");
    System.out.println(string1.equals(string2));
    System.out.println(string2.equals(string3));
    System.out.println(string1.equals(string3));
  }
}
