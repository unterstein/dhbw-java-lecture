package ba.java.oo.interfaces;

import ba.java.gehaltsberechnung.testpacket.SpecialGF;

public class Person implements SpeziellerAngestellter {

  @Override
  public int getTelefon() {
    return 12345;
  }

  public static void main(String[] args) {
    Person person = new Person();

    System.out.println(((Angestellter) person).getTelefon());
  }

  @Override
  public int getTelefon2() {
    return 1;
  }
}
