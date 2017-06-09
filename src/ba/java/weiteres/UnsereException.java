package ba.java.weiteres;

public class UnsereException extends Exception {
  private int i;

  public UnsereException(int i) {
    super("" + i);
    this.i = i;
  }

  public int getI() {
    return i;
  }
}
