package ba.java.oo;

import java.util.HashSet;
import java.util.Set;

public class Rechteck {
  int laenge;
  int breite;

  public Rechteck(int laenge, int breite) {
    this.laenge = laenge;
    this.breite = breite;
  }

  public Rechteck(int laenge) {
    this(laenge, laenge);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Rechteck) {
      Rechteck other = (Rechteck) obj;
      return other.laenge == laenge && other.breite == breite;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return laenge * breite;
  }

  public static void main(String[] args) {
    Rechteck r1 = new Rechteck(1, 2);
    Rechteck r2 = new Rechteck(1, 2);
    System.out.println(r1 == r2);
    System.out.println(r1.equals(r2));

    // Beispiel Set
    Set<Rechteck> meinSet = new HashSet<>();
    meinSet.add(new Rechteck(1, 2));
    meinSet.add(new Rechteck(1, 2));
    System.out.println(meinSet.size());
  }
}
