package ba.java.utilities.exception;

public class BuchhaltungFehlgeschlagenException extends Exception {
  private int mitarbeiterNummer;

  public BuchhaltungFehlgeschlagenException(String message, int meinInternerFehlerCode) {
    super(message);
    this.mitarbeiterNummer = meinInternerFehlerCode;
  }
}
