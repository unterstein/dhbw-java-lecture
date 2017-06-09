package ba.java.oo;

import java.util.ArrayList;
import java.util.List;

public class Quadrat {

  private static int seiten = 4;
  private int laenge;

  private static List meineListe = new ArrayList();

  static {
    seiten = 4;
    System.out.println("static");
    meineListe.add(123);
    meineListe.add(123);
    meineListe.add(123);
    meineListe.add(123);
  }

  public Quadrat(int laenge) {
    System.out.println("dynamic");
    this.laenge = laenge;
  }

  private static int getUmfang(int laenge) {
    return laenge * seiten;
  }

  public int getUmfang() {
    return getUmfang(laenge);
  }

  public static void main(String[] args) {
    final Quadrat q1 = new Quadrat(12);
    System.out.println(q1.getUmfang());


//    final int i = 12;
//    i = 13;
//
//
//    q1.laenge = 13;
//    q1 = new Quadrat(14);

    Quadrat q2 = new Quadrat(13);


    Quadrat.seiten = 5;
    q1.seiten = 12;
    q2.seiten = 13;
    System.out.println(q1.seiten);
    System.out.println(Quadrat.getUmfang(14));
  }
}
