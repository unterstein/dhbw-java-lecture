package ba.java.weiteres.generics;

import java.util.List;

public class ListeVerwendung {
  public ListeVerwendung() {
    // Beispiel eines generischen Typs
    Liste<Integer> liste = new Liste<Integer>(10);
    liste.add(5);
//        liste.add(1.5); // Compiler-Fehler!

    // Typinkompatibilität in generischen Typen
    // Bei generischen Typen ist Polymorphie
    // der verwendeten Typen nicht vollständig gegeben:
    Liste<Integer> listeInt = new Liste<Integer>(10);
//        Liste<Number> listeNum = listeInt; // Compiler-Fehler!
    // Dies ist verboten, weil sonst folgender Code möglich wäre:
//        Liste<Double> listeDb = new Liste<Double>(10);
//        Liste<Number> listeNum = listeDb;
//        listeNum.add(new Integer(7));
//        Double d = listeDb.get(0); // -> Integer(7)

  }

  public void printAll(List<?> l) {
    for (Object o : l) {
      System.out.println(o);
    }
  }

  // Vorsicht: Das ist nicht unsere Klasse Liste!
  public void printAllNumber(List<? extends Number> list) {
    List<? extends Number> liste2; // Auch dies ist lesend!
    for (Number numb : list) {
      System.out.println(numb.doubleValue());
    }
  }
}
