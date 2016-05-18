package ba.java.grundlagen;

import ba.java.auto.AudiQFuenf;
import ba.java.auto.Pkw;

public class CastingBeispiel {

  public static void main(String[] args) {
    int zahl = 5;
    long langeZahl = zahl;
    int integer2 = (int) langeZahl;


    AudiQFuenf q5 = new AudiQFuenf();
    Pkw pkw = q5; // im Speicher immer noch das selbe Objekt!! Nur andere Referenz darauf.
    AudiQFuenf q5again = (AudiQFuenf) pkw;
  }
}
