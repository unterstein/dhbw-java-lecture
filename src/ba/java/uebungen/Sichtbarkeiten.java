package ba.java.uebungen;


public class Sichtbarkeiten {

  private int var;
  private TestKlasse testKlasse;

  public Sichtbarkeiten(int var1, int var2) {
    this.var = var1;
    testKlasse = new TestKlasse(var2);
  }

  private class TestKlasse {

    private int var;

    public TestKlasse(int var) {
      this.var = var;
    }

    public void sumVars(int var) {
      System.out.println(Sichtbarkeiten.this.var + this.var + var);
    }
  }

  public static void main(String[] args) {
    Sichtbarkeiten sichtbarkeiten = new Sichtbarkeiten(11, 12);
    sichtbarkeiten.testKlasse.sumVars(13);
  }
}
