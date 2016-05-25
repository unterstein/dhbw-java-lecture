package ba.java.oo;

public class ThisSuperBeispiel {

  private int numberOfSomething;

  private String stringOfSomething;

  public ThisSuperBeispiel() {
    // stringOfSomething ist Variable von eigener Klasse. Aufrufe müssen nicht explizit mit this deklariert werden!
    stringOfSomething = "Hello!";
    // könnn es aber  ;)
    this.stringOfSomething = "Hi!";
  }

  public void setNumberOfSomething(int numberOfSomething) {
    System.out.println(numberOfSomething);
    System.out.println(this.numberOfSomething);
  }

  public void print() {
    // toString ist Methode von Superklasse. Aufrufe müssen nicht explizit mit "super." deklariert werden!
    System.out.println(toString());
  }

  public static void main(String[] args) {
    ThisSuperBeispiel beispiel = new ThisSuperBeispiel();
    beispiel.numberOfSomething = 12;
    beispiel.setNumberOfSomething(13);
  }
}
