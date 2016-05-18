package ba.java.oo.konstruktor;

public class Konstruktor {

  protected int irgendwas;


  public Konstruktor() {
    System.out.println("Konstruktor()");
  }

  protected Konstruktor(int irgendwas) {
    super();
    this.irgendwas = irgendwas;
  }

  public Konstruktor(int einInt, int zweiInt) {
    this(einInt + zweiInt);
  }
}
