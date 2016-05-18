package ba.java.oo;

public class Quadrat {

  private static int seiten;
  private int laenge;

  static {
    seiten = 4;
    System.out.println("static");
  }

  public Quadrat() {
    System.out.println("dynamic");
  }

  private static int getUmfang(int laenge) {
    return laenge * seiten;
  }

  public int getUmfang() {
    return getUmfang(laenge);
  }
}
