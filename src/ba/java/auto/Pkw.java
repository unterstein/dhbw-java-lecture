package ba.java.auto;

public class Pkw extends BodenFahrzeug {
  public static int ANZAHL_REIFEN = 4;

  public void hupe() {
    System.out.println("hup hup");
  }

  public int anzahlBlinker;

  private final int meinPrivateInt = 7;

  public boolean brauchtWartung() {
    return false;
  }

  public void blinkeRechts() {
    System.out.println("blink blink");
  }

  @Override
  public double getBreite() {
    return 2.2;
  }

  @Override
  public double getHöhe() {
    return 1.6;
  }

  @Override
  public double getLaenge() {
    return 4.5;
  }
}
