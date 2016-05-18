package ba.java.weiteres.enums;

public class EnumBeispiel {

  // Lokale Enumeration
  enum Farbe {
    ROT, GRUEN, BLAU
  }

  public EnumBeispiel() {
    // Deklaration
    Farbe farbe;
    // Initialisierung
    farbe = Farbe.ROT;
    System.out.println(farbe);
    farbe = Farbe.valueOf("ROT");
    System.out.println(farbe);
  }

  public static void main(String[] args) {
    new EnumBeispiel();
  }
}
