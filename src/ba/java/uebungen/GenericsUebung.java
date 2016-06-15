package ba.java.uebungen;

import ba.java.auto.Pkw;
import ba.java.oo.Rechteck;

import java.util.ArrayList;
import java.util.List;

public class GenericsUebung {

  public static void main(String[] args) {
    List<Object> nichtGenerischeListe = new ArrayList<Object>();

    nichtGenerischeListe.add(new Pkw());
    nichtGenerischeListe.add(new Rechteck(1, 2));

    List<Pkw> autoListe = new ArrayList<Pkw>();
    autoListe.add(new Pkw());
    // autoListe.add(new Rechteck(1, 2));

    printAllElements(autoListe);
    System.out.println("----");
    printAllElements(nichtGenerischeListe);
    System.out.println("----");
    printAllPkw(autoListe);
    // printAllPkw(nichtGenerischeListe);
  }

  public static void printAllElements(List<?> meineListe) {
    for (Object o : meineListe) {
      System.out.println(o);
    }
  }

  public static void printAllPkw(List<? extends Pkw> meineListe) {
    for (Pkw o : meineListe) {
      o.blinkeRechts();
      System.out.println(o);
    }
  }
}
