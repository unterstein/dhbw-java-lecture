package ba.java.auto;

public class AutoBeispiel {

  public static void main(String[] args) {
    AudiQFuenf audi = new AudiQFuenf();
    System.out.println(audi.ANZAHL_REIFEN);
    System.out.println(Pkw.ANZAHL_REIFEN);
    audi.hupe();


    Pkw kfz = new AudiQFuenf();
    // Ruft die Methode der Klasse Suv auf
    kfz.blinkeRechts();
  }
}
