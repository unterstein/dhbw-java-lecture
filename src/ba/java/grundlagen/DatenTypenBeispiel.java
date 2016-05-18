package ba.java.grundlagen;

import ba.java.auto.AudiQFuenf;
import ba.java.auto.BodenFahrzeug;
import ba.java.auto.Lkw;
import ba.java.auto.Pkw;

public class DatenTypenBeispiel {

  // Deklaration
  private int meineZahl;

  public DatenTypenBeispiel() {
    // Initialisierung
    meineZahl = 5;
    int meineZweiteZahl = 6;
  }

  private void stringBeispiel() {
    String ersterString = "Hallo ".concat(String.valueOf(meineZahl));
    ersterString += meineZahl;
    System.out.println(ersterString);
    String zweiterString = "Hallo 55";
    System.out.println(zweiterString == ersterString);
    System.out.println(zweiterString.equals(ersterString));
    System.out.println(ersterString.substring(0, ersterString.indexOf("5")).charAt(3));
  }

  private void arrayBeispiel() {
    // Deklaration
    int[] meinArray;
    int auchMeinArray[]; // Schreibweise vermeiden!
    // Initialisierung
    meinArray = new int[5];
    meinArray[0] = 1;
    int[] literate = {1, 2, 3}; // literale Initialisierung
  }

  private void castBeispiel() {
    BodenFahrzeug fahrzeug = new Lkw();

    if (fahrzeug instanceof Pkw) {
      Pkw pkw = (Pkw) fahrzeug;
    }
    System.out.println("hallo");
  }

  private void instanceOfBeispiel() {
    Pkw pkw = new Pkw();
    System.out.println(pkw instanceof Pkw);
    System.out.println(pkw instanceof BodenFahrzeug);
    System.out.println(pkw instanceof AudiQFuenf);
    int anzahlBlinker = pkw.anzahlBlinker;
    pkw.blinkeRechts();
  }

  public static void main(String[] args) {
    DatenTypenBeispiel beispiel  = new DatenTypenBeispiel();
    beispiel.stringBeispiel();
    beispiel.arrayBeispiel();
    beispiel.stringBeispiel();
    beispiel.instanceOfBeispiel();
  }

}
