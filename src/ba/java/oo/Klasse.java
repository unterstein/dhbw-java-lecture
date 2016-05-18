package ba.java.oo;

public class Klasse {

  // Attribute:
  String einString;

  public Klasse() {
    this.einString = "Mein toller String";
    this.getString();
    this.einString = "lala";
  }

  // Methoden:
  public String getString() {
    return einString;
  }

  public void setEinString(String einString) {
    this.einString = einString;
  }

  public static void main(String[] args) {

  }
}
