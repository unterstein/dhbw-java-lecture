package ba.java.oo.sichtbarkeit;

public class Sichtbarkeit2 extends Sichtbarkeit {
  private int i = 7;

  public Sichtbarkeit2() {
    int i = 4;
    printInt();
    printInt(this.i + i);
  }

  @Override
  protected void printInt(int i) {
    System.out.println(i + 5);
  }

  public static void main(String[] args) {
    new Sichtbarkeit2();
  }
}
