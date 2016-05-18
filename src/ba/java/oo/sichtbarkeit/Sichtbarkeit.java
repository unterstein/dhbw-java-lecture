package ba.java.oo.sichtbarkeit;

public class Sichtbarkeit {
  private int i = 5;

  public Sichtbarkeit() {
    int i = 30;
    System.out.println(this.i);
    i += 5;
    printInt(i);
  }

  protected void printInt() {
    System.out.println(i + 10);
  }

  protected void printInt(int i) {
    System.out.println(i + 10);
  }

}
