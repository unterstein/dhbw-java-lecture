package ba.java.oo;

public class WrapperClasses {
  public WrapperClasses() {
    // Instanziierung

    // Übergabe des zu kapselnden primitiven Typs
    Integer integer1 = new Integer(1);
    // Meist können auch Strings übergeben werden
    // Vorsicht bei diesem Aufruf.
    // Es kann eine Ausnahme auftreten!
    Integer integer2 = new Integer("1");

    // Rückgabe, auch schon gecastet möglich
    int i = integer1.intValue();
    short short1 = integer1.shortValue();
    String string1 = integer1.toString();

    // Auch das parsen von Strings ist meistens möglich
    // Auch hier kann eine Ausnahme auftreten!
    Integer integer3 = Integer.parseInt("42");

    // Kann natürlich auch in die Hose gehen!
    Integer intereger4 = Integer.parseInt("Müll");
  }

  public static void main(String[] args) {
    new WrapperClasses();
  }
}
