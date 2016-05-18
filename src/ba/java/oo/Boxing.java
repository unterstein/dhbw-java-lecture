package ba.java.oo;

import java.util.ArrayList;
import java.util.List;

public class Boxing {

  public static void main(String[] args) {
    // List<int> nicht möglich, daher List<Integer>
    List<Integer> alleMeineZahlen = new ArrayList<>();
    alleMeineZahlen.add(12); // auto boxing
    int primitive = alleMeineZahlen.get(0); // auto unboxing
    Integer reference = alleMeineZahlen.get(0); // nix spezielles

    // soweit alles ok, aber bei folgendem Code potentielle Gefahr:
    Integer meineMagischeZahl = null; // Referenztypen dürfen mit null initialisiert werden
    magieMitZahlen(meineMagischeZahl); // Es wid auto unboxing versucht, allerdings fliegt es fürchterlich auf die Nase!
  }

  private static int magieMitZahlen(int i) {
    return i * 2;
  }
}
