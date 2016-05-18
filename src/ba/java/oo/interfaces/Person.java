package ba.java.oo.interfaces;

public class Person implements PrivatPerson, SpeziellerAngestellter {

  @Override
  public int getTelefon() {
    return 0;
  }


  @Override
  public int getTelefon2() {
    return 2;
  }
}
