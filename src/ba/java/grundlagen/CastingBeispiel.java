package ba.java.grundlagen;

import ba.java.auto.AudiQFuenf;
import ba.java.auto.Pkw;

import java.util.ArrayList;
import java.util.List;

public class CastingBeispiel {

  public static void main(String[] args) {
    int zahl = 5;
    long langeZahl = zahl;

    int integer2 = (int) langeZahl;


    AudiQFuenf q5 = new AudiQFuenf();
    Pkw pkw = q5; // im Speicher immer noch das selbe Objekt!! Nur andere Referenz darauf.
    AudiQFuenf q5again = (AudiQFuenf) pkw;

    System.out.println(q5 instanceof AudiQFuenf);
    System.out.println(q5 instanceof Pkw);
    System.out.println(pkw instanceof Pkw);
    System.out.println(pkw instanceof AudiQFuenf);
    System.out.println(pkw instanceof Object);
    System.out.println(pkw.getClass());

    // typisches Beispiel
    if(pkw instanceof AudiQFuenf) {
      AudiQFuenf meinAudi = (AudiQFuenf) pkw;
      meinAudi.blinkeRechts();
    }

    AudiQFuenf nochEinAudi = (AudiQFuenf) new Pkw();

    String result = pkw instanceof AudiQFuenf ?
        "Ist ein Audi" : "Ist kein Audi";
    System.out.println(result);

    System.out.println(pkw == null ? "" : pkw.toString());
  }

  private static int[] sort(int[] meinArray) {
    return new int[0];
  }
}
